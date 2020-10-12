
<a name="definitions"></a>
## 定义

<a name="cellstyle"></a>
### CellStyle

|名称|说明|类型|
|---|---|---|
|**alignment**  <br>*可选*|**样例** : `"string"`|enum (GENERAL, LEFT, CENTER, RIGHT, FILL, JUSTIFY, CENTER_SELECTION, DISTRIBUTED)|
|**alignmentEnum**  <br>*可选*|**样例** : `"string"`|enum (GENERAL, LEFT, CENTER, RIGHT, FILL, JUSTIFY, CENTER_SELECTION, DISTRIBUTED)|
|**borderBottom**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderBottomEnum**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderLeft**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderLeftEnum**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderRight**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderRightEnum**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderTop**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**borderTopEnum**  <br>*可选*|**样例** : `"string"`|enum (NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT)|
|**bottomBorderColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**dataFormat**  <br>*可选*|**样例** : `0`|integer (int32)|
|**dataFormatString**  <br>*可选*|**样例** : `"string"`|string|
|**fillBackgroundColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fillBackgroundColorColor**  <br>*可选*|**样例** : `"[color](#color)"`|[Color](#color)|
|**fillForegroundColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fillForegroundColorColor**  <br>*可选*|**样例** : `"[color](#color)"`|[Color](#color)|
|**fillPattern**  <br>*可选*|**样例** : `"string"`|enum (NO_FILL, SOLID_FOREGROUND, FINE_DOTS, ALT_BARS, SPARSE_DOTS, THICK_HORZ_BANDS, THICK_VERT_BANDS, THICK_BACKWARD_DIAG, THICK_FORWARD_DIAG, BIG_SPOTS, BRICKS, THIN_HORZ_BANDS, THIN_VERT_BANDS, THIN_BACKWARD_DIAG, THIN_FORWARD_DIAG, SQUARES, DIAMONDS, LESS_DOTS, LEAST_DOTS)|
|**fillPatternEnum**  <br>*可选*|**样例** : `"string"`|enum (NO_FILL, SOLID_FOREGROUND, FINE_DOTS, ALT_BARS, SPARSE_DOTS, THICK_HORZ_BANDS, THICK_VERT_BANDS, THICK_BACKWARD_DIAG, THICK_FORWARD_DIAG, BIG_SPOTS, BRICKS, THIN_HORZ_BANDS, THIN_VERT_BANDS, THIN_BACKWARD_DIAG, THIN_FORWARD_DIAG, SQUARES, DIAMONDS, LESS_DOTS, LEAST_DOTS)|
|**font**  <br>*可选*|**样例** : `"[font](#font)"`|[Font](#font)|
|**fontIndex**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hidden**  <br>*可选*|**样例** : `true`|boolean|
|**indention**  <br>*可选*|**样例** : `0`|integer (int32)|
|**index**  <br>*可选*|**样例** : `0`|integer (int32)|
|**leftBorderColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**locked**  <br>*可选*|**样例** : `true`|boolean|
|**quotePrefixed**  <br>*可选*|**样例** : `true`|boolean|
|**rightBorderColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**rotation**  <br>*可选*|**样例** : `0`|integer (int32)|
|**shrinkToFit**  <br>*可选*|**样例** : `true`|boolean|
|**topBorderColor**  <br>*可选*|**样例** : `0`|integer (int32)|
|**verticalAlignment**  <br>*可选*|**样例** : `"string"`|enum (TOP, CENTER, BOTTOM, JUSTIFY, DISTRIBUTED)|
|**verticalAlignmentEnum**  <br>*可选*|**样例** : `"string"`|enum (TOP, CENTER, BOTTOM, JUSTIFY, DISTRIBUTED)|
|**wrapText**  <br>*可选*|**样例** : `true`|boolean|


<a name="color"></a>
### Color
*类型* : object


<a name="font"></a>
### Font

|名称|说明|类型|
|---|---|---|
|**bold**  <br>*可选*|**样例** : `true`|boolean|
|**color**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fontHeight**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fontHeightInPoints**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fontName**  <br>*可选*|**样例** : `"string"`|string|
|**index**  <br>*可选*|**样例** : `0`|integer (int32)|
|**italic**  <br>*可选*|**样例** : `true`|boolean|
|**strikeout**  <br>*可选*|**样例** : `true`|boolean|
|**typeOffset**  <br>*可选*|**样例** : `0`|integer (int32)|
|**underline**  <br>*可选*|**最小值** : `-128`  <br>**最大值** : `127`  <br>**样例** : `0`|integer (int32)|


<a name="d5eb5331f41efec686d2d1c190c2d225"></a>
### PageInfo«Role»

|名称|说明|类型|
|---|---|---|
|**endRow**  <br>*可选*|**样例** : `0`|integer (int32)|
|**firstPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hasNextPage**  <br>*可选*|**样例** : `true`|boolean|
|**hasPreviousPage**  <br>*可选*|**样例** : `true`|boolean|
|**isFirstPage**  <br>*可选*|**样例** : `true`|boolean|
|**isLastPage**  <br>*可选*|**样例** : `true`|boolean|
|**lastPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|**样例** : `[ "[role](#role)" ]`|< [Role](#role) > array|
|**navigateFirstPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigateLastPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigatePages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigatepageNums**  <br>*可选*|**样例** : `[ 0 ]`|< integer (int32) > array|
|**nextPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**prePage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**size**  <br>*可选*|**样例** : `0`|integer (int32)|
|**startRow**  <br>*可选*|**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="4994708ea1e995db67c5e36e9a5fb662"></a>
### PageInfo«User»

|名称|说明|类型|
|---|---|---|
|**endRow**  <br>*可选*|**样例** : `0`|integer (int32)|
|**firstPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hasNextPage**  <br>*可选*|**样例** : `true`|boolean|
|**hasPreviousPage**  <br>*可选*|**样例** : `true`|boolean|
|**isFirstPage**  <br>*可选*|**样例** : `true`|boolean|
|**isLastPage**  <br>*可选*|**样例** : `true`|boolean|
|**lastPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|**样例** : `[ "[user](#user)" ]`|< [User](#user) > array|
|**navigateFirstPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigateLastPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigatePages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**navigatepageNums**  <br>*可选*|**样例** : `[ 0 ]`|< integer (int32) > array|
|**nextPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**prePage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**size**  <br>*可选*|**样例** : `0`|integer (int32)|
|**startRow**  <br>*可选*|**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="role"></a>
### Role

|名称|说明|类型|
|---|---|---|
|**cellStyleMap**  <br>*可选*|**样例** : `{<br>  "string" : "[cellstyle](#cellstyle)"<br>}`|< string, [CellStyle](#cellstyle) > map|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**roleId**  <br>*可选*|角色ID  <br>**样例** : `"string"`|string|
|**roleName**  <br>*可选*|角色名称  <br>**样例** : `"string"`|string|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|


<a name="user"></a>
### User

|名称|说明|类型|
|---|---|---|
|**age**  <br>*可选*|年龄  <br>**样例** : `0`|integer (int64)|
|**birthDate**  <br>*可选*|出生日期  <br>**样例** : `"string"`|string|
|**cellStyleMap**  <br>*可选*|**样例** : `{<br>  "string" : "[cellstyle](#cellstyle)"<br>}`|< string, [CellStyle](#cellstyle) > map|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**idNumber**  <br>*可选*|身份证号  <br>**样例** : `"string"`|string|
|**nativePlace**  <br>*可选*|籍贯  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|
|**userId**  <br>*可选*|主键  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|



