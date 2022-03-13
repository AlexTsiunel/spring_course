package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
//    private void allMethodsFromUniversityLibrary(){};
//
//    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary() {};
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniversityLibrary() {};
//
//    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }


//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() ||" +
//            "allReturnMethodsFromUniversityLibrary() ")
//    private void allGetAndReturnMethodsFromUniversityLibrary() {
//    }
//
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    private void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    private void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    private void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }



    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: logging attempt to get a book ");
    }


}

