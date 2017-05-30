# SSM 基本学习（一）
================================================================
### 1. SpringMVC+Spring+Myatis 环境搭建。

### 2. UserServiceImplTest 用PowerMock简单 test。

    了解更多可参考：http://blog.csdn.net/jackiehff/article/details/14000779

### 3. mybatis多表查询：
----------------------------------------------------------------
  1> getAll() N+1  不宜选择   
  
  2> getAll2() 两表联合查询，可选择。只查询出角色ID，数据格式如下：   
  
    `{
        "createdatetime": "2017-05-03 22:20:24",
        "createtime": "2017-05-04 22:20:50",
        "id": "1",
        "modifydatetime": "2017-05-04 22:20:32",
        "name": "张三",
        "pwd": "123456",
        "updatetime": "2017-05-04 22:20:53",
        "userRoles": [
            {
                "id": "1",
                "roleid": "1",
                "userid": "1"
            }
        ]
    }`   
    
   3> getAll3() 三表联合查询 collection，association使用。
