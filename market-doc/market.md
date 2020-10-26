# market数据库设计文档

### 商品(commodity)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|商品id|
|name|varchar||否|商品名称|
|position_id|int8||是|对应货架id|
|price|int4||否|单价|
|inventory|int4||否|库存|
|unit_id|int8||否|对应单位id|
|description|varchar||是|商品描述|
|type_id|int4||否|对应商品类型id|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
|code|varchar||否|商品编码|
### 商品元素关系表(commodity_factor)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|表内id|
|commodity_id|int8||否|商品id|
|factor_id|int8||否|元素id|
|degree|int4||是|关联程度|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### 顾客表(customer)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|顾客id|
|code|varchar||否|顾客编码|
|name|varchar||否|姓名|
|gender|varchar||否|性别|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### 顾客元素关联表(customer_factor)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|表内id|
|customer_id|int8||否|顾客id|
|factor_id|int8||否|元素id|
|degree|int4||是|关联程度|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### 元素表(factor)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|元素id|
|name|varchar||否|元素名称|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### flyway_schema_history(flyway_schema_history)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|installed_rank|int4||否|null|
|version|varchar||是|null|
|description|varchar||否|null|
|type|varchar||否|null|
|script|varchar||否|null|
|checksum|int4||是|null|
|installed_by|varchar||否|null|
|installed_on|timestamp||否|null|
|execution_time|int4||否|null|
|success|bool||否|null|
### 货架表(position)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|货架id|
|name|varchar||否|货架具体位置|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### 购买记录表(record)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|记录id|
|customer_id|int8||否|顾客id|
|commodity_id|int8||否|商品id|
|quantity|int4||否|数量|
|total_price|int8||否|总价|
|degree|int4||是|满意程度|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
### 单位表(unit)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|单位id|
|name|varchar||否|单位名称|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
