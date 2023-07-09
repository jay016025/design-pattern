package dynamicProxy;

import dynamicProxy.invocationHandler.NonOwnerInvocationHandler;
import dynamicProxy.invocationHandler.OwnerInvocationHandler;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    @Test
    public void testDynamicProxy_ownerProxy() {
        // arrange
        Person jay = new ConcretePerson();
        jay.setName("jay");
        jay.setGender("male");
        jay.setInterests("coding");

        // ack
        Person ownerProxy = getOwnerProxy(jay);
        ownerProxy.setInterests("Sing a song");
        System.out.println("set interest from owner proxy!!");

        try {
            ownerProxy.setRating(10);
        }catch (Exception e) {
            System.out.println("Can't set rating from owner proxy!!");
        }
    }

    @Test
    public void testDynamicProxy_nonOwnerProxy() {
        // arrange
        Person jay = new ConcretePerson();
        jay.setName("jay");
        jay.setGender("male");
        jay.setInterests("coding");

        Person nonOwnerProxy = getNonOwnerProxy(jay);
        System.out.println("name is " + nonOwnerProxy.getName());

        // ack
        try {
            nonOwnerProxy.setInterests("coding");
        }catch (Exception e) {
            System.out.println("Can't set interest from nonOwner proxy!!");
        }

        nonOwnerProxy.setRating(10);
        System.out.println("set rating from nonOwner proxy!!");
        System.out.println("Rating is " + nonOwnerProxy.getRating());

    }

    /*
        取得代理物件實例
     */
    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person) {

        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}