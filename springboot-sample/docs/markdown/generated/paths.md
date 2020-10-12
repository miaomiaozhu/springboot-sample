
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



