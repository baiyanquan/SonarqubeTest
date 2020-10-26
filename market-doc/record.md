# 购买记录表(record)
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
