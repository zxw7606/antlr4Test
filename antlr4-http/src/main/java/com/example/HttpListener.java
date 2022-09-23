// Generated from E:/java_project/antlr4Test/antlr4-http\Http.g4 by ANTLR 4.10.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HttpParser}.
 */
public interface HttpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HttpParser#http_messages}.
	 * @param ctx the parse tree
	 */
	void enterHttp_messages(HttpParser.Http_messagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#http_messages}.
	 * @param ctx the parse tree
	 */
	void exitHttp_messages(HttpParser.Http_messagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#http_message}.
	 * @param ctx the parse tree
	 */
	void enterHttp_message(HttpParser.Http_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#http_message}.
	 * @param ctx the parse tree
	 */
	void exitHttp_message(HttpParser.Http_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#start_line}.
	 * @param ctx the parse tree
	 */
	void enterStart_line(HttpParser.Start_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#start_line}.
	 * @param ctx the parse tree
	 */
	void exitStart_line(HttpParser.Start_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#request_line}.
	 * @param ctx the parse tree
	 */
	void enterRequest_line(HttpParser.Request_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#request_line}.
	 * @param ctx the parse tree
	 */
	void exitRequest_line(HttpParser.Request_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(HttpParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(HttpParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#request_target}.
	 * @param ctx the parse tree
	 */
	void enterRequest_target(HttpParser.Request_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#request_target}.
	 * @param ctx the parse tree
	 */
	void exitRequest_target(HttpParser.Request_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#origin_form}.
	 * @param ctx the parse tree
	 */
	void enterOrigin_form(HttpParser.Origin_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#origin_form}.
	 * @param ctx the parse tree
	 */
	void exitOrigin_form(HttpParser.Origin_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_path(HttpParser.Absolute_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_path(HttpParser.Absolute_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(HttpParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(HttpParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#http_version}.
	 * @param ctx the parse tree
	 */
	void enterHttp_version(HttpParser.Http_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#http_version}.
	 * @param ctx the parse tree
	 */
	void exitHttp_version(HttpParser.Http_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#http_name}.
	 * @param ctx the parse tree
	 */
	void enterHttp_name(HttpParser.Http_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#http_name}.
	 * @param ctx the parse tree
	 */
	void exitHttp_name(HttpParser.Http_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#header_field}.
	 * @param ctx the parse tree
	 */
	void enterHeader_field(HttpParser.Header_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#header_field}.
	 * @param ctx the parse tree
	 */
	void exitHeader_field(HttpParser.Header_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(HttpParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(HttpParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(HttpParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(HttpParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#field_value}.
	 * @param ctx the parse tree
	 */
	void enterField_value(HttpParser.Field_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#field_value}.
	 * @param ctx the parse tree
	 */
	void exitField_value(HttpParser.Field_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#field_content}.
	 * @param ctx the parse tree
	 */
	void enterField_content(HttpParser.Field_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#field_content}.
	 * @param ctx the parse tree
	 */
	void exitField_content(HttpParser.Field_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#field_vchar}.
	 * @param ctx the parse tree
	 */
	void enterField_vchar(HttpParser.Field_vcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#field_vchar}.
	 * @param ctx the parse tree
	 */
	void exitField_vchar(HttpParser.Field_vcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#obs_text}.
	 * @param ctx the parse tree
	 */
	void enterObs_text(HttpParser.Obs_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#obs_text}.
	 * @param ctx the parse tree
	 */
	void exitObs_text(HttpParser.Obs_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#obs_fold}.
	 * @param ctx the parse tree
	 */
	void enterObs_fold(HttpParser.Obs_foldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#obs_fold}.
	 * @param ctx the parse tree
	 */
	void exitObs_fold(HttpParser.Obs_foldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#urlchar}.
	 * @param ctx the parse tree
	 */
	void enterUrlchar(HttpParser.UrlcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#urlchar}.
	 * @param ctx the parse tree
	 */
	void exitUrlchar(HttpParser.UrlcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(HttpParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(HttpParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(HttpParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(HttpParser.UnreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void enterSub_delims(HttpParser.Sub_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void exitSub_delims(HttpParser.Sub_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#tchar}.
	 * @param ctx the parse tree
	 */
	void enterTchar(HttpParser.TcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#tchar}.
	 * @param ctx the parse tree
	 */
	void exitTchar(HttpParser.TcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#vCHAR}.
	 * @param ctx the parse tree
	 */
	void enterVCHAR(HttpParser.VCHARContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#vCHAR}.
	 * @param ctx the parse tree
	 */
	void exitVCHAR(HttpParser.VCHARContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#message_body}.
	 * @param ctx the parse tree
	 */
	void enterMessage_body(HttpParser.Message_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#message_body}.
	 * @param ctx the parse tree
	 */
	void exitMessage_body(HttpParser.Message_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HttpParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HttpParser.CommentContext ctx);
}