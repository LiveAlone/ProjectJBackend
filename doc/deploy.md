# 开发环境构建

---

## 依赖

- mysql
- redis

### sql 初始化

```sql
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    id BIGINT NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

DELETE FROM `user` where 1=1;

INSERT INTO `user` (id, name, age, email) VALUES (1, 'Jone', 18, 'test1@test.com'), 
                                                 (2, 'Jack', 20, 'test2@test.com'),
                                                 (3, 'Tom', 28, 'test3@test.com'),
                                                 (4, 'Sandy', 21, 'test4@test.com'), 
                                                 (5, 'Billie', 24, 'test5@test.com');
```

## 构建云开发环境

### docker compose 初始化依赖服务

```dockerfile
# 本地环境
services:
  # mysql
  mysql:
    image: mysql:8.3
    hostname: mysql
    networks:
      - local-dev
    ports:
      - 3306:3306
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: todos
    volumes:
      - /Users/yaoqijun/workspace/data/docker/mysql:/var/lib/mysql

  redis:
    image: redis:7
    hostname: redis
    ports:
      - 6379:6379
    networks:
      - local-dev
    volumes:
      - /Users/yaoqijun/workspace/data/docker/redis:/data
  
  zk:
    image: zookeeper:3.9
    hostname: zk
    ports:
      - 2181:2181
    networks:
      - local-dev

networks:
  local-dev:
    name: local-dev
    external: true

# cloud 环境

```

ZK 服务注册中心
```shell
docker run -d --name local-zk --network local-dev -p 2181:2181 zookeeper:3.9
```


### 项目启动 

- 激活场景: ```Dspring.profiles.active=cloud```
