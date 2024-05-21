INSERT INTO brands(brand) VALUES('SONY');
INSERT INTO  brands(brand) VALUES('Sennheiser');
INSERT INTO  brands(brand) VALUES('AudioTechnica');
INSERT INTO  brands(brand) VALUES('Panasonic');
INSERT INTO  brands(brand) VALUES('JBL');

INSERT INTO  audio_codec(codec) VALUES('LDAC');
INSERT INTO  audio_codec(codec) VALUES('apt-x');
INSERT INTO  audio_codec(codec) VALUES('SBC/AAC');


INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(1, 1, 'WH-1000XM5', 41800,'SONY/WH1000XM5<br>発売日：2022/5/27<br>特徴：包み込まれるようにダイナミックな曲を楽しめる');
INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(1, 1, 'WF-1000XM5', 59400,'SONY/WF-1000XM5<br>発売日：2023/9/1<br>特徴：強力なノイズキャンセリングに加えて、ダイナミックな音楽を楽しめる');
INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(1, 1, 'LinkBuds S', 26400,'SONY/LinkBuds S<br>発売日：2022/11/4');

INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(4, 1, 'EAH-AZ80-S', 36630,'Panasonic/EAH-AZ80-S<br>発売日：2023/6/15');

INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(2, 2, 'MOMENTUM True Wireless 4 S',49940,'Sennheiser/MOMENTUM True Wireless 4 S<br>発売日：2024/3/1');
INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(2, 2, 'MOMENTUM 4 Wireless', 54890,'Sennheiser/MOMENTUM 4 Wireless<br>発売日：2022/8/23');

INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(3, 2, 'ATH-TWX9 S', 36300,'AudioTechnica/ATH-TWX9 S<br>発売日：2022/09/03');
INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(3, 2, 'ATH-M50xBT2', 26620,'AudioTechnica/ATH-M50xBT2<br>発売日：2021/9/24');

INSERT INTO items(brand_id, codec_id, name, price, describe) VALUES(5, 3, 'JBL Tour Pro2', 33000,'JBL Tour Pro2<br>発売日：2023/3/10');

INSERT INTO customers(name, address, tel, email) VALUES('田中太郎','東京都', '090-1111-1111','tanaka@aaa.com');
INSERT INTO customers(name, address, tel, email) VALUES('鈴木一郎','大阪府', '090-1111-2222','suzuki@aaa.com');

INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(1, '2024-04-12', 6760);
INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(2, '2024-04-13', 2500);

INSERT INTO order_details(order_id, item_id, quantity) VALUES(1, 1, 2);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(2, 2, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(3, 7, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(4, 1, 1);

INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最高', 'もうこれしかない', 2, 2, 1, '2024-04-12');
INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最悪', '迫力がない', 1, 1, 1, '2024-04-13');
