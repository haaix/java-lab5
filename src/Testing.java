import java.util.Scanner;

public class Testing<b> {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲");

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


        int a = 0;
        while (a == 0){
            System.out.println("\n输入需要查找的字或词：");
            Scanner in = new Scanner(System.in);
            String s1 = in.next();
            getCount(String.valueOf(sb), s1);
        }
    }


    public static void getCount(String str, String x){
        int index = 0;
        int count = 0;
        while((index = str.indexOf(x)) != -1){
            count++;
            str = str.substring(index + 1);
        }
        System.out.println(x +"共出现了"+count+"次");
    }

}


