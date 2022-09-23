grammar http;

/* 参考 https://github.com/antlr/grammars-v4/blob/master/http/http.g4 */
http_message: start_line (header_field CRLF)* CRLF EOF //message_body
            ;

/*
 start-line = request‑line/ status‑line
 */
start_line: request_line;

/*
 request-line = method SP request‑target SP HTTP‑version CRLF
 */
request_line: method SP request_target SP (http_version)? CRLF;

/*
 request-target= origin-form/ absolute-form/ authority-form/ asterisk-form
 */
request_target: origin_form;

/*
 origin-form= absolute-path [ "?" query ]
 */
origin_form: absolute_path (QuestionMark query)?;

/*
  改成任意字符
*/
absolute_path: STRING;
/*
  改成任意字符
*/
query: STRING;
/*
 method= token ; "GET" ;→RFC 7231 – Section 4.3.1 ; "HEAD" ;→RFC 7231 – Section 4.3.2 ; "POST"
 ;→RFC 7231 – Section 4.3.3 ; "PUT" ;→RFC 7231 – Section 4.3.4 ; "DELETE" ;→RFC 7231 – Section
 4.3.5 ; "CONNECT" ;→RFC 7231 – Section 4.3.6 ; "OPTIONS" ;→RFC 7231 – Section 4.3.7 ; "TRACE"
 ;→RFC 7231 – Section 4.3.8
 */
method:
	'GET'
	| 'HEAD'
	| 'POST'
	| 'PUT'
	| 'DELETE'
	| 'CONNECT'
	| 'OPTIONS'
	| 'TRACE';


http_version: http_name DIGIT Dot DIGIT;

http_name: 'HTTP/';
/*
 header-field= field-name ":" OWS field-value OWS
 */
header_field: field_name Colon OWS* field_value OWS*;

field_name: STRING;
field_value: STRING;

/*
 DIGIT= %x30‑39 ;0-9
 */
DIGIT: [0-9];
CRLF: '\n';
Dot   : '.';
QuestionMark: '?';
Colon: ':';

STRING: .*?;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

/*
 SP= %x20 ;space
 */
SP: ' ';
HTAB: '\t';
OWS: SP | HTAB;
LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;