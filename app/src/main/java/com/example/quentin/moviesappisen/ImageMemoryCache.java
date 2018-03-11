package com.example.quentin.moviesappisen;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Remi on 07/03/2018.
 */

public class ImageMemoryCache {

    private LruCache<String, Bitmap> mMemoryCache;

    public ImageMemoryCache(int maxCacheSize) {
        mMemoryCache = new LruCache<String, Bitmap>(maxCacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
            }
        };
    }



    public void addBitmapToMemoryCache(String imgUrlAsKey, Bitmap bitmap) {
        if (null == mMemoryCache.get(imgUrlAsKey)){
            mMemoryCache.put(imgUrlAsKey, bitmap);
        }
    }

    public Bitmap getBitmapFromMemCache(String imgUrlAsKey) {
        return (null != mMemoryCache.get(imgUrlAsKey) ? mMemoryCache.get(imgUrlAsKey) : null);
    }
}