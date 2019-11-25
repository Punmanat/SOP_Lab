# BookService_SOP_Workshop1
## List of service
1. ดูหนังสือทั้งหมด
``` javascript
GET /books
```
2. เรียกดูหนังสือตาม ISBN
``` javascript
GET /books/{ISBN}
``` 
3. สั่งซื้อหนังซื้อ
``` javascript
POST /books
```
3.1 JSON สำหรับสั่งซื้อหนังสือ
``` javascript
 {"id":{เลข id ของหนังสือ : int}, "amount":{จำนวณเล่ม : integer}}
```
