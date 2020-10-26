# 商品(commodity)
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
