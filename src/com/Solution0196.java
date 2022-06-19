package com;

/*196. 删除重复的电子邮箱*/
public class Solution0196 {
    /*方法一：delete from Person where Id not in (select * from (select min(Id) from Person group by Email) as x*/
    /*方法二（开窗函数）：delete
                        from Person
                        where Id in
                            (
                                select Id
                                from
                                    (select Id, row_number() over(partition by Email order by Id) rn
                                    from Person
                                    ) t1
                                where rn > 1
                             )
    */
}
