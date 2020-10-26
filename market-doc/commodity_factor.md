# 商品元素关系表(commodity_factor)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|表内id|
|commodity_id|int8||否|商品id|
|factor_id|int8||否|元素id|
|degree|int4||是|关联程度|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
