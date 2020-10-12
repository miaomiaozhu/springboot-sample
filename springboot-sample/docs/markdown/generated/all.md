# swagger-ui 标题


<a name="overview"></a>
## 概览
swagger-ui 描述


### 版本信息
*版本* : 1.0


### URI scheme
*域名* : localhost:8080  
*基础路径* : /


### 标签

* role-controller : 角色controller
* user-controller : 用户controller




<a name="paths"></a>
## 资源

<a name="role-controller_resource"></a>
### Role-controller
角色controller


<a name="addsaveusingpost"></a>
#### 新增角色
```
POST /sample/role/add
```


##### 说明
新增角色


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**role**  <br>*必填*|role|[Role](#role)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/add
```


###### 请求 body
```json
{
  "cellStyleMap" : {
    "string" : "[cellstyle](#cellstyle)"
  },
  "createBy" : "string",
  "createTime" : "string",
  "roleId" : "string",
  "roleName" : "string",
  "updateBy" : "string",
  "updateTime" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="roledetailusingget"></a>
#### 查询角色详情
```
GET /sample/role/detail
```


##### 说明
查询角色详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*可选*|id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/detail
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="editsaveusingpost"></a>
#### 修改角色
```
POST /sample/role/edit
```


##### 说明
修改角色


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**role**  <br>*必填*|role|[Role](#role)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/edit
```


###### 请求 body
```json
{
  "cellStyleMap" : {
    "string" : "[cellstyle](#cellstyle)"
  },
  "createBy" : "string",
  "createTime" : "string",
  "roleId" : "string",
  "roleName" : "string",
  "updateBy" : "string",
  "updateTime" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="exportusingget"></a>
#### 导出角色列表
```
GET /sample/role/export
```


##### 说明
导出角色列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**createBy**  <br>*可选*|创建人|string|
|**Query**|**createTime**  <br>*可选*|创建时间|string (date-time)|
|**Query**|**roleId**  <br>*可选*|角色ID|string|
|**Query**|**roleName**  <br>*可选*|角色名称|string|
|**Query**|**updateBy**  <br>*可选*|更新人|string|
|**Query**|**updateTime**  <br>*可选*|更新时间|string (date-time)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/export
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="importroleusingpost"></a>
#### 导入角色列表
```
POST /sample/role/importRole
```


##### 说明
导入角色列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**file**  <br>*必填*|file|file|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/importRole
```


###### 请求 formData
```json
"file"
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="listusingget"></a>
#### 查询角色列表
```
GET /sample/role/list
```


##### 说明
查询角色列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**createBy**  <br>*可选*|创建人|string||
|**Query**|**createTime**  <br>*可选*|创建时间|string (date-time)||
|**Query**|**pageNum**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|每页条数|integer (int32)|`10`|
|**Query**|**roleId**  <br>*可选*|角色ID|string||
|**Query**|**roleName**  <br>*可选*|角色名称|string||
|**Query**|**updateBy**  <br>*可选*|更新人|string||
|**Query**|**updateTime**  <br>*可选*|更新时间|string (date-time)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[PageInfo«Role»](#d5eb5331f41efec686d2d1c190c2d225)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/list
```


##### HTTP响应示例

###### 响应 200
```json
{
  "endRow" : 0,
  "firstPage" : 0,
  "hasNextPage" : true,
  "hasPreviousPage" : true,
  "isFirstPage" : true,
  "isLastPage" : true,
  "lastPage" : 0,
  "list" : [ {
    "cellStyleMap" : {
      "string" : "[cellstyle](#cellstyle)"
    },
    "createBy" : "string",
    "createTime" : "string",
    "roleId" : "string",
    "roleName" : "string",
    "updateBy" : "string",
    "updateTime" : "string"
  } ],
  "navigateFirstPage" : 0,
  "navigateLastPage" : 0,
  "navigatePages" : 0,
  "navigatepageNums" : [ 0 ],
  "nextPage" : 0,
  "pageNum" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "prePage" : 0,
  "size" : 0,
  "startRow" : 0,
  "total" : 0
}
```


<a name="removeusingpost"></a>
#### 删除角色
```
POST /sample/role/remove
```


##### 说明
删除角色


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**ids**  <br>*可选*|角色ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/remove
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="roleexportusingget"></a>
#### 导出角色列表
```
GET /sample/role/roleExport
```


##### 说明
导出角色列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**createBy**  <br>*可选*|创建人|string|
|**Query**|**createTime**  <br>*可选*|创建时间|string (date-time)|
|**Query**|**roleId**  <br>*可选*|角色ID|string|
|**Query**|**roleName**  <br>*可选*|角色名称|string|
|**Query**|**updateBy**  <br>*可选*|更新人|string|
|**Query**|**updateTime**  <br>*可选*|更新时间|string (date-time)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/sample/role/roleExport
```


##### HTTP响应示例

###### 响应 200
```json
"string"
```


<a name="user-controller_resource"></a>
### User-controller
用户controller


<a name="adduserusingpost"></a>
#### 新增保存用戶
```
POST /user/add
```


##### 说明
导出用戶列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**user**  <br>*必填*|user|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/add
```


###### 请求 body
```json
{
  "age" : 0,
  "birthDate" : "string",
  "cellStyleMap" : {
    "string" : "[cellstyle](#cellstyle)"
  },
  "createBy" : "string",
  "createTime" : "string",
  "idNumber" : "string",
  "nativePlace" : "string",
  "remark" : "string",
  "updateBy" : "string",
  "updateTime" : "string",
  "userId" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="importuserusingpost"></a>
#### 导入用戶列表
```
POST /user/importUser
```


##### 说明
导入用戶列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**file**  <br>*必填*|file|file|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/importUser
```


###### 请求 formData
```json
"file"
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="removeuserusingpost"></a>
#### 删除用戶
```
POST /user/removeUser
```


##### 说明
删除用戶


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**ids**  <br>*可选*|用户ids|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/removeUser
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="updateuserusingpost"></a>
#### 修改保存用戶
```
POST /user/updateUser
```


##### 说明
修改保存用戶


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**user**  <br>*必填*|user|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/updateUser
```


###### 请求 body
```json
{
  "age" : 0,
  "birthDate" : "string",
  "cellStyleMap" : {
    "string" : "[cellstyle](#cellstyle)"
  },
  "createBy" : "string",
  "createTime" : "string",
  "idNumber" : "string",
  "nativePlace" : "string",
  "remark" : "string",
  "updateBy" : "string",
  "updateTime" : "string",
  "userId" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="userdetailusingget"></a>
#### 查询用戶详情
```
GET /user/userDetail
```


##### 说明
查询用戶详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*可选*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/userDetail
```


##### HTTP响应示例

###### 响应 200
```json
"object"
```


<a name="userexportusingget"></a>
#### 导出用戶列表
```
GET /user/userExport
```


##### 说明
导出用戶列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**age**  <br>*可选*|年龄|integer (int64)|
|**Query**|**birthDate**  <br>*可选*|出生日期|string|
|**Query**|**createBy**  <br>*可选*|创建人|string|
|**Query**|**createTime**  <br>*可选*|创建时间|string (date-time)|
|**Query**|**idNumber**  <br>*可选*|身份证号|string|
|**Query**|**nativePlace**  <br>*可选*|籍贯|string|
|**Query**|**remark**  <br>*可选*|备注|string|
|**Query**|**updateBy**  <br>*可选*|更新人|string|
|**Query**|**updateTime**  <br>*可选*|更新时间|string (date-time)|
|**Query**|**userId**  <br>*可选*|主键|string|
|**Query**|**userName**  <br>*可选*|姓名|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/userExport
```


<a name="userlistusingget"></a>
#### 查询用戶列表
```
GET /user/userList
```


##### 说明
查询用戶列表


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**age**  <br>*可选*|年龄|integer (int64)||
|**Query**|**birthDate**  <br>*可选*|出生日期|string||
|**Query**|**createBy**  <br>*可选*|创建人|string||
|**Query**|**createTime**  <br>*可选*|创建时间|string (date-time)||
|**Query**|**idNumber**  <br>*可选*|身份证号|string||
|**Query**|**nativePlace**  <br>*可选*|籍贯|string||
|**Query**|**pageNum**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|每页条数|integer (int32)|`10`|
|**Query**|**remark**  <br>*可选*|备注|string||
|**Query**|**updateBy**  <br>*可选*|更新人|string||
|**Query**|**updateTime**  <br>*可选*|更新时间|string (date-time)||
|**Query**|**userId**  <br>*可选*|主键|string||
|**Query**|**userName**  <br>*可选*|姓名|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[PageInfo«User»](#4994708ea1e995db67c5e36e9a5fb662)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/userList
```


##### HTTP响应示例

###### 响应 200
```json
{
  "endRow" : 0,
  "firstPage" : 0,
  "hasNextPage" : true,
  "hasPreviousPage" : true,
  "isFirstPage" : true,
  "isLastPage" : true,
  "lastPage" : 0,
  "list" : [ {
    "age" : 0,
    "birthDate" : "string",
    "cellStyleMap" : {
      "string" : "[cellstyle](#cellstyle)"
    },
    "createBy" : "string",
    "createTime" : "string",
    "idNumber" : "string",
    "nativePlace" : "string",
    "remark" : "string",
    "updateBy" : "string",
    "updateTime" : "string",
    "userId" : "string",
    "userName" : "string"
  } ],
  "navigateFirstPage" : 0,
  "navigateLastPage" : 0,
  "navigatePages" : 0,
  "navigatepageNums" : [ 0 ],
  "nextPage" : 0,
  "pageNum" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "prePage" : 0,
  "size" : 0,
  "startRow" : 0,
  "total" : 0
}
```




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





