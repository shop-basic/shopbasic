----------DELETE--------------------
DELETE FROM product_packaging
delete from [product]
DELETE FROM [dbo].[manufacturer]
DELETE FROM [dbo].packaging_unit
DELETE FROM [product_category]
DELETE FROM [packaging_unit]
----------------------[manufacturer]---------------------------

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer1' ,'address1' ,'Manufacturer1')

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer2' ,'address2' ,'Manufacturer2')

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer3' ,'address3' ,'Manufacturer3')

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer4' ,'address4' ,'Manufacturer4')

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer5' ,'address5' ,'Manufacturer5')

INSERT INTO [dbo].[manufacturer] ([manufacturer_id] ,[address] ,[name]) 
VALUES ('Manufacturer6' ,'address1' ,'Manufacturer6')

-------------------[packaging_unit]------------------------------

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT1' ,'Unit1' ,'U1')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT2' ,'Unit2' ,'U2')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT3' ,'Unit3' ,'U3')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT4' ,'Unit4' ,'U4')

---------------------[product_category]-------------------

INSERT INTO [dbo].[product_category] ([category_id] ,[name]) 
VALUES ('category1' ,'category 1')

INSERT INTO [dbo].[product_category] ([category_id] ,[name]) 
VALUES ('category2' ,'category 2')

---------------------[packaging_unit]----------------------

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT1' ,'Unit1' ,'U1')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT2' ,'Unit2' ,'U2')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT3' ,'Unit3' ,'U3')

INSERT INTO [dbo].[packaging_unit] ([unit_id] ,[unit] ,[unit_abbr]) 
VALUES ('UNIT4' ,'Unit4' ,'U4')

--------------------[product]---------------------

INSERT INTO [dbo].[product] ([product_id] ,[active_flag] ,[avatar] ,[create_time] ,[name] ,[revision_time] ,[manufacturer_manufacturer_id] ,[packaging_unit_unit_id] ,[product_category_category_id]) 
VALUES ('product1' ,1 ,'' ,GETDATE() ,'Product 1' ,GETDATE() ,'Manufacturer1' ,'unit1' ,'category1')

INSERT INTO [dbo].[product] ([product_id] ,[active_flag] ,[avatar] ,[create_time] ,[name] ,[revision_time] ,[manufacturer_manufacturer_id] ,[packaging_unit_unit_id] ,[product_category_category_id]) 
VALUES ('product2' ,1 ,'' ,GETDATE() ,'Product 2' ,GETDATE() ,'Manufacturer2' ,'unit2' ,'category1')

INSERT INTO [dbo].[product] ([product_id] ,[active_flag] ,[avatar] ,[create_time] ,[name] ,[revision_time] ,[manufacturer_manufacturer_id] ,[packaging_unit_unit_id] ,[product_category_category_id]) 
VALUES ('product3' ,1 ,'' ,GETDATE() ,'Product 3' ,GETDATE() ,'Manufacturer2' ,'unit2' ,'category1')

INSERT INTO [dbo].[product] ([product_id] ,[active_flag] ,[avatar] ,[create_time] ,[name] ,[revision_time] ,[manufacturer_manufacturer_id] ,[packaging_unit_unit_id] ,[product_category_category_id]) 
VALUES ('product4' ,1 ,'' ,GETDATE() ,'Product 4' ,GETDATE() ,'Manufacturer3' ,'unit2' ,'category1')


------------------------------[product_packaging]----------------------------------------

INSERT INTO [dbo].[product_packaging] ([product_packaging_id] ,[active_flag] ,[available_units] ,[create_time] ,[manufacturer] ,[name] ,[packaging_unit] ,[price] ,[revision_time] ,[packaging_product_id])
VALUES ('packaging1' ,1 , 100 ,GETDATE() ,'manufacturer1' , 'Packaging1','unit2' ,100 ,GETDATE() ,'product1')

INSERT INTO [dbo].[product_packaging] ([product_packaging_id] ,[active_flag] ,[available_units] ,[create_time] ,[manufacturer] ,[name] ,[packaging_unit] ,[price] ,[revision_time] ,[packaging_product_id])
VALUES ('packaging2' ,1 , 100 ,GETDATE() ,'manufacturer2' , 'Packaging2','unit2' ,100 ,GETDATE() ,'product2')

INSERT INTO [dbo].[product_packaging] ([product_packaging_id] ,[active_flag] ,[available_units] ,[create_time] ,[manufacturer] ,[name] ,[packaging_unit] ,[price] ,[revision_time] ,[packaging_product_id])
VALUES ('packaging4' ,1 , 100 ,GETDATE() ,'manufacturer2' , 'Packaging3','unit2' ,100 ,GETDATE() ,'product2')

INSERT INTO [dbo].[product_packaging] ([product_packaging_id] ,[active_flag] ,[available_units] ,[create_time] ,[manufacturer] ,[name] ,[packaging_unit] ,[price] ,[revision_time] ,[packaging_product_id])
VALUES ('packaging3' ,1 , 100 ,GETDATE() ,'manufacturer2' , 'Packaging3','unit2' ,100 ,GETDATE() ,'product2')




