# 顾客元素关联表(customer_factor)
| 列名   | 类型   | KEY  | 可否为空 | 注释   |
| ---- | ---- | ---- | ---- | ---- |
|id|int8||否|表内id|
|customer_id|int8||否|顾客id|
|factor_id|int8||否|元素id|
|degree|int4||是|关联程度|
|is_active|bool||否|null|
|created_at|timestamptz||否|null|
|updated_at|timestamptz||否|null|
