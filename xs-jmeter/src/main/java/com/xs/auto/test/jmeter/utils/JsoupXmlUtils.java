package com.xs.auto.test.jmeter.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用JSoup解析XML的工具类
 * 支持增删改查、属性查询、动态添加子节点等操作
 */
public class JsoupXmlUtils {
    private Document document;
    private String filePath;

    /**
     * 构造函数 - 从文件加载XML
     */
    public JsoupXmlUtils(String filePath) throws IOException {
        this.filePath = filePath;
        loadFromFile(filePath);
    }

    /**
     * 构造函数 - 创建新的XML文档
     */
    public JsoupXmlUtils(String rootElementName, String encoding) {
        createNewDocument(rootElementName, encoding);
    }

    /**
     * 从文件加载XML
     */
    private void loadFromFile(String filePath) throws IOException {
        this.document = Jsoup.parse(new File(filePath), "UTF-8", "", org.jsoup.parser.Parser.xmlParser());
    }

    /**
     * 创建新的XML文档
     */
    private void createNewDocument(String rootElementName, String encoding) {
        String xmlTemplate = "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?><" + rootElementName + "></" + rootElementName + ">";
        this.document = Jsoup.parse(xmlTemplate, "", org.jsoup.parser.Parser.xmlParser());
    }

    /**
     * 保存XML到文件
     */
    public void saveToFile() throws IOException {
        if (this.filePath == null) {
            throw new IllegalStateException("文件路径未设置");
        }
        saveToFile(this.filePath);
    }

    /**
     * 保存XML到指定文件
     */
    public void saveToFile(String filePath) throws IOException {
        // 设置输出格式
        document.outputSettings()
                .prettyPrint(true)
                .indentAmount(4)
                .charset(StandardCharsets.UTF_8)
                .syntax(Document.OutputSettings.Syntax.xml);

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(document.outerHtml().getBytes(StandardCharsets.UTF_8));
        }
    }

    /**
     * 获取根元素
     */
    public Element getRootElement() {
        return document.children().first();
    }

    /**
     * 根据CSS选择器查询元素
     */
    public Elements selectElements(String cssQuery) {
        return document.select(cssQuery);
    }

    /**
     * 根据元素名称查询元素
     */
    public Elements getElementsByTagName(String tagName) {
        return document.getElementsByTag(tagName);
    }

    /**
     * 根据元素名称和属性查询元素
     */
    public Elements getElementsByAttribute(String tagName, String attributeName, String attributeValue) {
        return document.select(tagName + "[" + attributeName + "=" + attributeValue + "]");
    }

    /**
     * 根据ID查询元素
     */
    public Element getElementById(String id) {
        return document.getElementById(id);
    }

    /**
     * 查询元素的文本内容
     */
    public String getElementText(Element element) {
        return element != null ? element.text() : "";
    }

    /**
     * 查询元素的完整文本内容（包括CDATA）
     */
    public String getElementFullText(Element element) {
        return element != null ? element.wholeText() : "";
    }

    /**
     * 查询元素的属性值
     */
    public String getAttributeValue(Element element, String attributeName) {
        return element != null ? element.attr(attributeName) : "";
    }

    /**
     * 创建新元素
     */
    public Element createElement(String tagName) {
        return document.createElement(tagName);
    }

    /**
     * 创建带文本内容的元素
     */
    public Element createElement(String tagName, String textContent) {
        Element element = createElement(tagName);
        element.text(textContent);
        return element;
    }

    /**
     * 创建带CDATA内容的元素
     */
    public Element createElementWithCData(String tagName, String cdataContent) {
        Element element = createElement(tagName);
        element.append("<![CDATA[" + cdataContent + "]]>");
        return element;
    }

    /**
     * 创建带属性和文本的元素
     */
    public Element createElement(String tagName, String textContent, String[][] attributes) {
        Element element = createElement(tagName, textContent);
        setAttributes(element, attributes);
        return element;
    }

    /**
     * 设置元素的多个属性
     */
    public void setAttributes(Element element, String[][] attributes) {
        if (element == null || attributes == null) return;

        for (String[] attr : attributes) {
            if (attr.length == 2) {
                element.attr(attr[0], attr[1]);
            }
        }
    }

    /**
     * 添加子元素到指定父元素
     */
    public void addChildElement(Element parent, Element child) {
        if (parent != null && child != null) {
            parent.appendChild(child);
        }
    }

    /**
     * 添加子元素到指定父元素（通过标签名查找）
     */
    public boolean addChildToParent(String parentTagName, Element child) {
        Elements parents = getElementsByTagName(parentTagName);
        if (!parents.isEmpty()) {
            parents.first().appendChild(child);
            return true;
        }
        return false;
    }

    /**
     * 添加子元素到指定父元素（通过ID查找）
     */
    public boolean addChildToParentById(String parentId, Element child) {
        Element parent = getElementById(parentId);
        if (parent != null) {
            parent.appendChild(child);
            return true;
        }
        return false;
    }

    /**
     * 在指定元素前插入兄弟元素
     */
    public void insertBefore(Element target, Element newElement) {
        if (target != null && newElement != null && target.parent() != null) {
            target.before(newElement);
        }
    }

    /**
     * 在指定元素后插入兄弟元素
     */
    public void insertAfter(Element target, Element newElement) {
        if (target != null && newElement != null && target.parent() != null) {
            target.after(newElement);
        }
    }

    /**
     * 更新元素的文本内容
     */
    public void updateElementText(Element element, String newText) {
        if (element != null) {
            element.text(newText);
        }
    }

    /**
     * 更新元素的HTML内容
     */
    public void updateElementHtml(Element element, String htmlContent) {
        if (element != null) {
            element.html(htmlContent);
        }
    }

    /**
     * 更新元素的属性
     */
    public void updateElementAttribute(Element element, String attributeName, String attributeValue) {
        if (element != null) {
            element.attr(attributeName, attributeValue);
        }
    }

    /**
     * 删除元素
     */
    public boolean removeElement(Element element) {
        if (element != null && element.parent() != null) {
            element.remove();
            return true;
        }
        return false;
    }

    /**
     * 根据标签名删除元素
     */
    public boolean removeElementsByTagName(String tagName) {
        Elements elements = getElementsByTagName(tagName);
        if (!elements.isEmpty()) {
            elements.remove();
            return true;
        }
        return false;
    }

    /**
     * 根据选择器删除元素
     */
    public boolean removeElementsBySelector(String cssQuery) {
        Elements elements = selectElements(cssQuery);
        if (!elements.isEmpty()) {
            elements.remove();
            return true;
        }
        return false;
    }

    /**
     * 获取元素的子元素列表
     */
    public Elements getChildElements(Element parent) {
        return parent != null ? parent.children() : new Elements();
    }

    /**
     * 获取元素的指定名称子元素
     */
    public Elements getChildElementsByTagName(Element parent, String tagName) {
        return parent != null ? parent.getElementsByTag(tagName) : new Elements();
    }

    /**
     * 获取父元素
     */
    public Element getParentElement(Element element) {
        return element != null ? element.parent() : null;
    }

    /**
     * 检查元素是否存在
     */
    public boolean elementExists(String cssQuery) {
        return !selectElements(cssQuery).isEmpty();
    }

    /**
     * 获取XML字符串
     */
    public String getXmlString() {
        document.outputSettings()
                .prettyPrint(true)
                .indentAmount(4)
                .charset(StandardCharsets.UTF_8)
                .syntax(Document.OutputSettings.Syntax.xml);

        return document.outerHtml();
    }

    /**
     * 格式化输出XML
     */
    public void printFormattedXml() {
        System.out.println(getXmlString());
    }

    /**
     * 添加注释
     */
    public void addComment(Element parent, String comment) {
        if (parent != null) {
            parent.append("<!-- " + comment + " -->");
        }
    }

    /**
     * 获取所有属性
     */
    public List<String> getAttributeNames(Element element) {
        List<String> attributes = new ArrayList<>();
        if (element != null) {
            element.attributes().forEach(attr -> attributes.add(attr.getKey()));
        }
        return attributes;
    }



    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis());
        }
    }
}