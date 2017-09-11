package JavaBasic;

import scala.collection.mutable.Buffer;

/**
 * Created by cWX491729 on 2017/9/11.
 */
public class Demo02 {
    public Buffer retain() {
        synchronized (recycleLock) {
            //预防性检测，先确认内存段是否已被回收
            ensureNotRecycled();
            referenceCount++;
            return this;
            redistributeBuffers
        }
    }
}
