# spring-flow



[spring-flow](https://github.com/710270532/spring-flow) is based on spring framework development, the open source framework which is configuration work flow by xml.


##	Install

```xml
<dependency>
    <groupId>hongwei.zhang</groupId>
    <artifactId>flow</artifactId>
    <version>1.0.0</version>
</dependency>
```

##	User Manual

#####	1.spring-flow.xml
```xml
<bean name="test.aHandler" class="flow.handler.AHandler" p:next-ref="test.bHandler"/>
<bean name="test.bHandler" class="flow.handler.BHandler" p:next-ref="test.cHandler"/>
<bean name="test.cHandler" class="flow.handler.CHandler"/>
```

#####	2.java
```java
public static void main(String[] args) {
    try {
        FlowUtil.start("test.first", null);
    } catch (FlowException e) {
        e.printStackTrace();
    }
}
```

##	About Us

version 1.0.0, Any questions, please send mail to <zhanghongwei@le.com>.
