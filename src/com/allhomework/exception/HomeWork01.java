package com.allhomework.exception;


/**
 * @author HuAng
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //编写应用程序 接收命令行的两个参数（整数），计算两数相除
        //计算两数相除 要求使用方法cal(int n1, int n2)
        //对数据格式不正确，缺少命令行参数，除0进行异常处理

        //思路：
        /*
        1.验证输入的参数个数是否正确 两个数
        2.先把输入的参数转换成整数
        3.double res = cal(n1, n2);//会出现运行异常 ArithmeticException 所以先捕获它
        最后编译时会出现 参数个数不对 因为使用的是 arg[]数组 输入数据需要在Edit Configuration 中进行输入
         */
        //1
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //2
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);
            System.out.println("计算结果： " + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对，请输入整数");
        }catch (ArithmeticException e){
            System.out.println("不能除0");
        }

    }

    public static double cal(int n1, int n2) {

        return n1 / n2;
    }
}

   