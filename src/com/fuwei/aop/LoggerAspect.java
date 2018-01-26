package com.fuwei.aop;

import org.apache.commons.logging.Log;    
import org.apache.commons.logging.LogFactory;    
import org.aspectj.lang.ProceedingJoinPoint;    
import org.aspectj.lang.annotation.Around;    
import org.aspectj.lang.annotation.Aspect;    
import org.aspectj.lang.reflect.MethodSignature;    
import org.springframework.stereotype.Component;  
  
/**  
 * 检测方法执行耗时的spring切面类  
 * 使用@Aspect注解的类，Spring将会把它当作一个特殊的Bean（一个切面），也就是不对这个类本身进行动态代理  
 * @author blinkfox  
 * @date 2016-07-04  
 */  
@Aspect  
@Component  
public class LoggerAspect {  
	private static Log logger = LogFactory.getLog(LoggerAspect.class);  
	private static final long ONE_MINUTE = 10000;  
	@Around(value = "execution(* com.fuwei.service.impl.CategoryServiceImpl.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
// 定义返回对象、得到方法需要的参数
        Object object = null;
        Object[] args = joinPoint.getArgs();
        long startTime = System.currentTimeMillis();

        try {
            object = joinPoint.proceed(args);
        } catch (Throwable e) {
            logger.error("统计某方法执行耗时环绕通知出错", e);
        }

        // 获取执行的方法名  
        long endTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();

        // 打印耗时的信息  
        this.printExecTime(methodName, startTime, endTime);

   return  object;
    }
	

    /**  
     * 打印方法执行耗时的信息，如果超过了一定的时间，才打印  
     * @param methodName  
     * @param startTime  
     * @param endTime  
     */  
    private void printExecTime(String methodName, long startTime, long endTime) {  
        long diffTime = endTime - startTime;  
        System.out.println("-----" + methodName + " 方法执行耗时：" + diffTime + " ms");
        if (diffTime > ONE_MINUTE) {  
            logger.warn("-----" + methodName + " 方法执行耗时：" + diffTime + " ms");  
        }  
    }  
}  
