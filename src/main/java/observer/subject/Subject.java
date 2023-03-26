package observer.subject;

import observer.observer.Observer;

/**
 * 觀察者模式 subject 介面
 * @author Jay Zhuang
 */
public interface Subject {

    /**
     * 註冊觀察者
     * @param observer
     */
    void register(Observer observer);

    /**
     * 移除觀察者
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 發送通知
     */
    void notifyObservers();
}
