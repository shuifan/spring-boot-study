package com.example.webservice.utils;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xjh1994
 * @date 2017/7/27
 * @intro
 */
public class DomMapUtil {

    public static Map<String, Object> Dom2Map(String result) throws DocumentException {
        org.dom4j.Document document = null;
        InputStream in = null;
        try {
            document = DocumentHelper.parseText(result);
        } catch (DocumentException e) {
            throw e;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return Dom2Map(document);
    }

    public static Map<String, Object> Dom2Map(org.dom4j.Document doc) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (doc == null)
            return map;
        org.dom4j.Element root = doc.getRootElement();
        return Dom2Map(root);
    }

    public static Map<String, Object> Dom2Map(org.dom4j.Element e) {
        Map map = new HashMap();
        List list = e.elements();
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                org.dom4j.Element iter = (org.dom4j.Element) list.get(i);
                List mapList = new ArrayList();
                if (iter.elements().size() > 0) {
                    Map m = Dom2Map(iter);
                    if (map.get(iter.getName()) != null) {
                        Object obj = map.get(iter.getName());
                        if (!obj.getClass().getName()
                                .equals("java.util.ArrayList")) {
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(m);
                        }
                        if (obj.getClass().getName()
                                .equals("java.util.ArrayList")) {
                            mapList = (List) obj;
                            mapList.add(m);
                        }
                        map.put(iter.getName(), mapList);
                    } else
                        map.put(iter.getName(), m);
                } else {
                    if (map.get(iter.getName()) != null) {
                        Object obj = map.get(iter.getName());
                        if (!obj.getClass().getName()
                                .equals("java.util.ArrayList")) {
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(iter.getText());
                        }
                        if (obj.getClass().getName()
                                .equals("java.util.ArrayList")) {
                            mapList = (List) obj;
                            mapList.add(iter.getText());
                        }
                        map.put(iter.getName(), mapList);
                    } else
                        map.put(iter.getName(), iter.getText());
                }
            }
        } else
            map.put(e.getName(), e.getText());

        return map;
    }

    public static List<Map> getFromMap(Map map) {
        List<Map> fromList = new ArrayList<Map>();
        try {
            fromList = (List<Map>) ((Map) map.get("ResultSet")).get("Resultset");
        } catch (Exception e) {
            fromList = new ArrayList<Map>();
        }
        return fromList;
    }

    public static Map getMapFromMap(Map map) {
        Map fromMap = new HashMap();
        try {
            fromMap = (Map) ((Map) map.get("ResultSet")).get("Resultset");
        } catch (Exception e) {
            fromMap = new HashMap();
        }
        return fromMap;
    }
}
