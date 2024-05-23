INSERT INTO type(type) VALUES('1');
INSERT INTO type(type) VALUES('2');

INSERT INTO brands(brand) VALUES('SONY');
INSERT INTO  brands(brand) VALUES('Sennheiser');
INSERT INTO  brands(brand) VALUES('AudioTechnica');
INSERT INTO  brands(brand) VALUES('Panasonic');
INSERT INTO  brands(brand) VALUES('JBL');

INSERT INTO  audio_codec(codec) VALUES('LDAC');
INSERT INTO  audio_codec(codec) VALUES('apt-x');
INSERT INTO  audio_codec(codec) VALUES('SBC/AAC');


INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(1, 1, 'WH-1000XM5', 41800,'・SONY/WH1000XM5<br>発売日：2022/5/27<br>特徴：ハイレゾ対応、WFシリーズよりも特大な30㎜ドライバーを採用。包み込まれるようなダイナミックな曲を楽しめる',1);
INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(1, 1, 'WF-1000XM5', 59400,'・SONY/WF-1000XM5<br>発売日：2023/9/1<br>特徴：ハイレゾ対応、強力なノイズキャンセリングに加え、耳に直接響く、ダイナミックな音楽を楽しめる',2);
INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(1, 1, 'LinkBuds S', 26400,'・SONY/LinkBuds S<br>発売日：2022/11/4<br>特徴：WHシリーズに比べ「音質」は劣るが「軽量」かつ「コンパクト」で「外音取り込み機能」が優秀',2);

INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(4, 1, 'EAH-AZ80-S', 36630,'・Panasonic/EAH-AZ80-S<br>発売日：2023/6/15<br>ハイレゾ対応、業界初3台同時接続可能。ボーカルを重視した曲、ゆったりとした曲が好みの型はこれ一択！',2);

INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(2, 2, 'MOMENTUM True Wireless 4 S',49940,'・Sennheiser/MOMENTUM True Wireless 4 S<br>発売日：2024/3/1<br>インパクトのある低音と精細な高音が彩る最高のサウンド体験を実現する',2);
INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(2, 2, 'MOMENTUM 4 Wireless', 54890,'・Sennheiser/MOMENTUM 4 Wireless<br>発売日：2022/8/23<br>42㎜の巨大なドライバーを採用。穏やかで低音の聞いた音が特徴的。長時間の着用も問題なし',1);

INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(3, 2, 'ATH-TWX9', 36300,'・AudioTechnica/ATH-TWX9<br>発売日：2022/09/03<br>イヤホンの中でも疲れにくい設計で、中域の印象が強めなイヤホン',2);
INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(3, 1, 'ATH-M50xBT2', 26620,'・AudioTechnica/ATH-M50xBT2<br>発売日：2021/9/24<br>透明感のある中高域表現と深く正確な低音レスポンスを実現し、爽快なリスニング体験が可能',1);

INSERT INTO items(brand_id, codec_id, name, price, describe, type) VALUES(5, 3, 'Tour Pro2', 33000,'・JBL Tour Pro2<br>発売日：2023/3/10<br>ディスプレイを搭載し、本体一つで様々なことが可能。iPhoneをお使いの方にもピッタリなコーデックを採用',2);

INSERT INTO customers(name, address, tel, email, pw) VALUES('田中太郎','東京都', '090-1111-1111','tanaka@aaa.com',1234);
INSERT INTO customers(name, address, tel, email, pw) VALUES('鈴木一郎','大阪府', '090-1111-2222','suzuki@aaa.com',5678);

INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(1, '2024-04-12', 6760);
INSERT INTO orders(customer_id, ordered_on, total_price) VALUES(2, '2024-04-13', 2500);

INSERT INTO order_details(order_id, item_id, quantity) VALUES(1, 1, 2);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(2, 2, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(3, 7, 1);
INSERT INTO order_details(order_id, item_id, quantity) VALUES(4, 1, 1);

INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最高', 'もうこれしかない', 2, 2, 1, '2024-04-12');
INSERT INTO review(title, report, score, customer_id, item_id, review_day) VALUES('最悪', '迫力がない', 1, 1, 1, '2024-04-13');
