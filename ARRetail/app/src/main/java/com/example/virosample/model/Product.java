/*
 * Copyright (c) 2017-present, Viro, Inc.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.virosample.model;

/**
 * Product class containing all properties relating to a product, like name, image, or model.
 */
public class Product {
    public final String mName;
    public final int mImage;
    public final String m3DModelUri;
    public final String mUrlWebPage;

    public Product(String name, int image, String modelAsset, String webpage){
        mName = name;
        mImage = image;
        m3DModelUri = modelAsset;
        mUrlWebPage = webpage;
    }
}
