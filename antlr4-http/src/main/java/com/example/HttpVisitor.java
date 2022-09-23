// Generated from E:/java_project/antlr4Test/antlr4-http\Http.g4 by ANTLR 4.10.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HttpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HttpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HttpParser#http_messages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttp_messages(HttpParser.Http_messagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#http_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttp_message(HttpParser.Http_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#start_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_line(HttpParser.Start_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#request_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest_line(HttpParser.Request_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(HttpParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#request_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest_target(HttpParser.Request_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#origin_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin_form(HttpParser.Origin_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#absolute_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute_path(HttpParser.Absolute_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(HttpParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#http_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttp_version(HttpParser.Http_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#http_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttp_name(HttpParser.Http_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#header_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_field(HttpParser.Header_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(HttpParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(HttpParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#field_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_value(HttpParser.Field_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#field_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_content(HttpParser.Field_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#field_vchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_vchar(HttpParser.Field_vcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#obs_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObs_text(HttpParser.Obs_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#obs_fold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObs_fold(HttpParser.Obs_foldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#urlchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlchar(HttpParser.UrlcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#pchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPchar(HttpParser.PcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#unreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved(HttpParser.UnreservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#sub_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_delims(HttpParser.Sub_delimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#tchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTchar(HttpParser.TcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#vCHAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVCHAR(HttpParser.VCHARContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#message_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_body(HttpParser.Message_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HttpParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(HttpParser.CommentContext ctx);
}