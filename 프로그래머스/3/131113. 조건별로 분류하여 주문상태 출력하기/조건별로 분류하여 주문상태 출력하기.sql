-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, to_char(OUT_DATE, 'YYYY-MM-DD') as OUT_DATE,
CASE
    WHEN out_date <= to_date('2022-05-01' , 'YYYY-MM-DD') THEN '출고완료'
    WHEN out_date is null THEN '출고미정'
    ELSE '출고대기'
    END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;