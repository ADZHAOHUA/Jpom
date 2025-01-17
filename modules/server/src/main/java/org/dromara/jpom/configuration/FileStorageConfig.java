/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Code Technology Studio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.dromara.jpom.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 文件管理存储
 *
 * @author bwcx_jzy
 * @since 23/12/25 025
 */
@Data
@ConfigurationProperties("jpom.file-storage")
public class FileStorageConfig {

    /**
     * 文件中心存储路径
     */
    private String savePah;
    /**
     * 静态目录扫描周期
     * <p>
     * 0 0/1 * * *
     */
    private String scanStaticDirCron = "0 0/1 * * *";
    /**
     * 开启静态目录监听
     */
    private Boolean watchMonitorStaticDir = true;
    /**
     * 监听深度
     */
    private Integer watchMonitorMaxDepth = 1;
}
