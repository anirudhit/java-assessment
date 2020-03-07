package com.spring.DependencyInjection;

public class ApplicationClass
{
    private Employee emp;
    
    public ApplicationClass(final Employee emp) {
        this.emp = emp;
    }
    
    public void callTask() {
        this.emp.doSomeTask();
    }
}