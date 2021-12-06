## 一、实验目的
掌握字符串String及其常用方法的使用

## 二、实验要求
&emsp;&emsp;有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复。

&emsp;&emsp;要求如下：
1. 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
2. 允许提供输入参数，统计古诗中某个字或词出现的次数。

**输入**：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质
<br>难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑
<br>洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短
<br>日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱
<br>在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下
<br>父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王
<br>看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行

**输出**：
<br>汉皇重色思倾国，御宇多年求不得。
<br>杨家有女初长成，养在深闺人未识。
<br>天生丽质难自弃，一朝选在君王侧。
<br>回眸一笑百媚生，六宫粉黛无颜色。
<br>春寒赐浴华清池，温泉水滑洗凝脂。
<br>侍儿扶起娇无力，始是新承恩泽时。
<br>云鬓花颜金步摇，芙蓉帐暖度春宵。
<br>春宵苦短日高起，从此君王不早朝。
<br>............

## 三、实验过程
1. 创建 StringBuffer 类并对其进行初始化。
2. 首先给用 insert 方法给古诗插入“，”，形成新的字符串。 再用 setCharAt 方法
把部分“，”替换“。”并形成新的字符串。继续用insert方法给古诗换行。最后用
delete 方法和 append 方法删除和追加细节处的符号，输出标准的古诗格式。
3. 定义 getCount 函数，用来统计单个字或者词出现的次数。用indexOf 方法，
返回检索字符在字符串中第一次出现处的索引。substring 方法返回子字符串。
输入所检索的词出现的次数。

## 四、主要代码
1. 设计标准古诗格式
```java
        StringBuffer sb = new StringBuffer("汉皇重色思倾国....");

        for (int i = 0; i < sb.length(); ) {
            if (i % 2 == 0) {
                sb.insert(i, "，");
            }
            if (i % 16 == 0) {
                sb.setCharAt(i, '。');
            }
            i = i + 8;
        }
        for (int i = 1; i < sb.length(); ) {
            sb.insert(i, "\n");
            i = i + 17;
        }
        sb.delete(0, 1);
        sb.append("。");
        System.out.println(sb);
```

2. getCount 函数统计某词出现的次数
```java
    public static void getCount(String str, String x){
        int index = 0;
        int count = 0;
        while((index = str.indexOf(x)) != -1){
            count++;
            str = str.substring(index + 1);
        }
        System.out.println(x +"共出现了"+count+"次");
    }
```

## 五、流程图
![](https://github.com/haaix/java-lab5/blob/main/img/%E6%B5%81%E7%A8%8B%E5%9B%BE.jpg)

## 六、运行截图
![](https://github.com/haaix/java-lab5/blob/main/img/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)

## 七、实验感想
&emsp;&emsp;通过本次实验,掌握了字符串String及其常用方法的使用。了解了StringBuffer类的使用,其方法也可以掌握，学会了
indexOf、substring等方法的使用场景和条件。
