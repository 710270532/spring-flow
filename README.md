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
