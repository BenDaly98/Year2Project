# --- Sample dataset
 
# --- !Ups
 
delete from item_on_sale;
delete from category;
 
insert into category (id,name) values ( 1,'Mobile Devices' );

 
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 1,1,'Samsung Galaxy s10','The next generation of Galaxy has arrived. Featuring an Infinity-O display, Wireless Power Sharing and Samsung's TrueVision camera system. The Galaxy S10 also features an in-screen ultrasonic fingerprint scanner to keep your phone secure',34, 849.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 2,1,'Samsung Galaxy s9','The Camera. Reimagined. The Galaxy S9 is packed with incredible features to help you do more than you ever imagined. With a revolutionary camera that adapts like the human eye, get ready to capture your world like never before.',56,629.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 3,1,'Apple iPhone XR 64gb','Brilliant. In every way. Powered by the same A12 processor as the iPhone Xs, the iPhone XR features one of the most advanced LCD screens ever seen on a smartphone.',52,809.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 4,1,'Apple iPhone 6s','Stronger and more powerful, the iPhone 6S features Apple's A9 processor to keep your apps running at top speed. Use Touch ID to interact with your iPhone in new ways. ',40,349.99);
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 5,1,'Apple iPhone 7','Apple iPhone 7 is the most innovative and creative iPhone yet. Your iPhone is now water and splash resistant to a rating of IP67. You will also enjoy a new audio experience with Lightning Connector EarPods',34,449.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 6,1,'Huawei p20','A pioneering camera phone from Huawei. The P20 Pro features a triple lens camera system powered by Artificial Intelligence and technology provided by Leica. Take stunning photos quickly and easily in a wide variety of conditions and view them on the gorgeous FullView display.',62,479.99 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 7,1,'Apple iPhone XS','Welcome to the big screens. The Apple iPhone Xs improves upon the innovations of the original iPhone X, with faster performance across the board. Face ID unlocking.',27,1099.00 );
