INSERT INTO brands(brand) VALUES('SONY');
INSERT INTO  brands(brand) VALUES('Sennheiser');
INSERT INTO  brands(brand) VALUES('AudioTechnica');
INSERT INTO  brands(brand) VALUES('Panasonic');
INSERT INTO  brands(brand) VALUES('JBL');

INSERT INTO  audio_codec(codec) VALUES('LDAC');
INSERT INTO  audio_codec(codec) VALUES('apt-x');
INSERT INTO  audio_codec(codec) VALUES('SBC/AAC');


INSERT INTO items(brand_id, codec_id, name, price) VALUES(1, 1, 'WH-1000XM5', 41800);
INSERT INTO items(brand_id, codec_id, name, price) VALUES(1, 1, 'WF-1000XM5', 59400);
INSERT INTO items(brand_id, codec_id, name, price) VALUES(1, 1, 'LinkBuds S', 26400);

INSERT INTO items(brand_id, codec_id, name, price) VALUES(4, 1, 'EAH-AZ80-S', 36630);

INSERT INTO items(brand_id, codec_id, name, price) VALUES(2, 2, 'MOMENTUM True Wireless 4 S',49940);
INSERT INTO items(brand_id, codec_id, name, price) VALUES(2, 2, 'MOMENTUM 4 Wireless', 54890);

INSERT INTO items(brand_id, codec_id, name, price) VALUES(3, 2, 'ATH-TWX9 S', 36300);
INSERT INTO items(brand_id, codec_id, name, price) VALUES(3, 2, 'ATH-M50xBT2', 26620);

INSERT INTO items(brand_id, codec_id, name, price) VALUES(5, 3, 'JBL Tour Pro2', 33000);

INSERT INTO customers(name, address, tel, email) VALUES('田中太郎','東京都', '090-1111-1111','tanaka@aaa.com');
INSERT INTO customers(name, address, tel, email) VALUES('田中太郎','大阪府', '090-1111-2222','suzuki@aaa.com');

INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(1, '2024-04-12', 6760);
INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(2, '2024-04-13', 2500);

INSERT INTO order_details(order_id, item_id, quantity) VALUES(1, 1, 2);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(2, 2, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(3, 7, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(4, 1, 1);

INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最高', 'もうこれしかない', 2, 2, 1, '2024-04-12');
INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最悪', '迫力がない', 1, 1, 1, '2024-04-13');
