package com.mvm.chrome.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mvm.chrome.model.Child;
import com.mvm.chrome.model.Schema;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Created by vmihnea on 11/20/2015.
 */
public class ParseJson {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // C:\Users\vmihnea\workspaces\git\humancloud\server\src\main\java\com\mvm\chrome\parser\Bookmarks.json

        InputStream src = new FileInputStream("C:\\Users\\vmihnea\\workspaces\\git\\humancloud\\server\\src\\main\\java\\com\\mvm\\chrome\\parser\\Bookmarks.json");
        Schema schema = mapper.readValue(src, Schema.class);

        Set<Child> children = schema.getRoots().getOther().getChildren();
        StringBuffer html = new StringBuffer();
        for (Child child : children) {
            if ("folder".equals(child.getType())) {


                if ("other".equals(child.getName())) {
                    // System.out.println("\n" + child);




                }


            }
        }

        html.append(parseChildren(schema.getRoots().getBookmarkBar(), 0));
        System.out.println("\n" + html);
    }

    private static StringBuffer parseChildren(Child child, int ident) {
        StringBuffer html = new StringBuffer();
        if (child == null) {
            return html;
        }

        html.append(getSpaces(ident) + "<DT><H3 ADD_DATE=\""+ child.getDateAdded() +"\" LAST_MODIFIED=\""+ child.getDateModified() +"\">"+child.getName()+"</H3>\n");
        html.append(getSpaces(ident) + "<DL><p>\n");

        for (Child kid : child.getChildren()) {
            if ("folder".equals(kid.getType())) {
                html.append(parseChildren(kid, ident+1));
            } else {
                //
                html.append(getSpaces(ident+1) + "<DT>");
                html.append("<A HREF=\"");
                html.append(kid.getUrl());
                html.append("\" ADD_DATE=\"");
                html.append(kid.getDateAdded());
                html.append("\">");
                html.append(kid.getName());
                html.append("</A>\n");
            }
        }

        html.append(getSpaces(ident) + "</DL><p>\n");
        return html;
    }

    private static String getSpaces(int ident) {
        String spaces = "";
        for (int i = 0; i < ident; i++) {
            spaces += "    ";
        }
        return spaces;
    }
}
