package com.brave.zhu.orm;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getContextClassLoader().getClass().getName());
        System.out.println(Main.class.getClassLoader().getClass().getName());
    }
    
    //    private static void loadIocContainer()
    //    {
    //        Resource resource = new ClassPathResource("abc.xml");
    //        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
    //        BeanDefinitionReader beanDefReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
    //        beanDefReader.loadBeanDefinitions(resource);
    //    }
}
