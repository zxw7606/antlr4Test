package com.example;

import com.example.HttpParser.Absolute_pathContext;
import com.example.HttpParser.CommentContext;
import com.example.HttpParser.Field_valueContext;
import com.example.HttpParser.Header_fieldContext;
import com.example.HttpParser.Http_messagesContext;
import com.example.HttpParser.Message_bodyContext;
import com.example.HttpParser.QueryContext;
import com.example.HttpParser.Request_targetContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.junit.Test;

public class HttpTests {

    @Test
    public void testInput() throws IOException {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("testCase/getTest.http");
        CharStream charStream = CharStreams.fromStream(inputStream);
        HttpLexer httpLexer = new HttpLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(httpLexer);
        HttpParser httpParser = new HttpParser(commonTokenStream);

        Http_messagesContext http_messagesContext = httpParser.http_messages();

        http_messagesContext.accept(new HttpBaseVisitor<Void>() {

            @Override
            public Void visitComment(CommentContext ctx) {
                String ctxText = ctx.getText();
                System.out.println(ctxText);
                return super.visitComment(ctx);
            }

            @Override
            public Void visitRequest_target(Request_targetContext ctx) {
                println("visitRequest_target", ctx.getText());
                return super.visitRequest_target(ctx);
            }


            @Override
            public Void visitAbsolute_path(Absolute_pathContext ctx) {
                println("visitAbsolute_path", ctx.getText());
                return super.visitAbsolute_path(ctx);
            }

            @Override
            public Void visitQuery(QueryContext ctx) {
                println("visitQuery", ctx.getText());
                return super.visitQuery(ctx);
            }

            @Override
            public Void visitHeader_field(Header_fieldContext ctx) {
                println("visitHeader_field", ctx.getText());
                return super.visitHeader_field(ctx);
            }

            @Override
            public Void visitMessage_body(Message_bodyContext ctx) {
                println("visitMessage_body", ctx.getText());
                return super.visitMessage_body(ctx);
            }
        });
//        new CommonTokenStream(new httpLexer())
    }

    public static void println(String prefix, String msg) {
        System.out.printf("%s,%s\n", prefix, msg);
    }

}
