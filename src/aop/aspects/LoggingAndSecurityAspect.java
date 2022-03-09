package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
    private void allMethodsFromUniversityLibrary(){};

    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
    private void returnMagazineFromUniversityLibrary() {};

    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
    private void allMethodsExceptReturnMagazineFromUniversityLibrary() {};

    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
    }


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


//    @Pointcut("execution(* get*())")
//    private void allGetMethods (){};
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to get a book ");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: rights verification ");
}

