ALTER TABLE fomosystems MODIFY COLUMN id INT auto_increment;


INSERT INTO reconusers(username,password,role,application) 
values('mithun','mithun','fomo','RR');
INSERT INTO reconusers(username,password,role,application) 
values('krishna','krishna','fomo','RR');
INSERT INTO reconusers(username,password,role,application) 
values('shashi','shashi','fo','RR');
INSERT INTO reconusers(username,password,role,application) 
values('shashank','shashank','mo','RR');


INSERT INTO fomosystems(tradeid,counterparty,currency,amount,buyorsell,tradedate,fees,quantity,exchange,price,rate,settlementdate,systemname)
values(1000,'JPMorgon','USD','542225','buy','20/08/2018','555','200','XYZ','51','96','21/12/2018','FO');

INSERT INTO fomosystems(tradeid,counterparty,currency,amount,buyorsell,tradedate,fees,quantity,exchange,price,rate,settlementdate,systemname)
values(1000,'JPMorgon','USD','542225','buy','20/08/2018','555','200','XYZ','51','96','21/12/2018','MO');

INSERT INTO fomosystems(tradeid,counterparty,currency,amount,buyorsell,tradedate,fees,quantity,exchange,price,rate,settlementdate,systemname)
values(1001,'Nomura','USD','542225','buy','20/08/2018','555','200','XYZ','51','96','21/12/2018','FO');

INSERT INTO fomosystems(tradeid,counterparty,currency,amount,buyorsell,tradedate,fees,quantity,exchange,price,rate,settlementdate,systemname)
values(1001,'Nomura','USD','542225','buy','20/08/2018','555','200','XYZ','51','96','21/12/2018','MO');



