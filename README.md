# java-io-core-demo

Java IO 主要关于Java对文件，目录的相关操作，所涉及的<em>java.io.*</em> 下面的类或接口。

<h2>文件相关</h2>

文件的操作通常包括文件的创建，读取，写入，修改，更新和删除等。

<a href="http://www.devnp.com/2017/04/02/java-create-file-%e6%96%87%e4%bb%b6%e7%9a%84%e5%88%9b%e5%bb%ba/" target="_blank">1. Java Create File 文件的创建</a>
<a href="http://www.devnp.com/2017/04/02/java-read-file-fileinputstream-%e6%96%87%e4%bb%b6%e7%9a%84%e8%af%bb%e5%8f%96/" target="_blank">2. Java Read File – 使用FileInputStream 文件的读取</a>
<a href="http://www.devnp.com/2017/04/02/java-file-read-bufferedreader-%e6%96%87%e4%bb%b6%e7%9a%84%e8%af%bb%e5%8f%96/" target="_blank">3. Java File Read – 使用BufferedReader 文件的读取</a>
<a href="http://www.devnp.com/2017/04/02/java-file-write-fileoutputstream-%e6%96%87%e4%bb%b6%e7%9a%84%e5%86%99%e5%85%a5/" target="_blank">4. Java File Write – 使用FileOutputStream 文件的写入</a>
<a href="http://www.devnp.com/2017/04/02/java-file-write-bufferedwriter-%e6%96%87%e4%bb%b6%e7%9a%84%e5%86%99%e5%85%a5/" target="_blank">5. Java File Write –使用 BufferedWriter 文件的写入</a>
<a href="http://www.devnp.com/2017/04/02/java-file-write-append-%e6%96%87%e4%bb%b6%e5%86%99%e5%85%a5%e5%86%85%e5%ae%b9%e7%9a%84%e8%bf%bd%e5%8a%a0/" target="_blank">6. Java File Write Append 文件写入内容的追加</a>
<a href="http://www.devnp.com/2017/04/02/java-file-delete-%e6%96%87%e4%bb%b6%e7%9a%84%e5%88%a0%e9%99%a4/" target="_blank">7. Java File Delete 文件的删除</a>
<a href="http://www.devnp.com/2017/04/02/java-file-rename-%e6%96%87%e4%bb%b6%e7%9a%84%e9%87%8d%e5%91%bd%e5%90%8d/" target="_blank">8. Java File Rename 文件的重命名</a>
<a href="http://www.devnp.com/2017/04/03/java-file-copy-%e6%96%87%e4%bb%b6%e7%9a%84%e6%8b%b7%e8%b4%9d/" target="_blank">9. Java File Copy 文件的拷贝</a>
<a href="http://www.devnp.com/2017/04/08/java-file-move-%e6%96%87%e4%bb%b6%e7%9a%84%e7%a7%bb%e5%8a%a8/" target="_blank">10. Java File Move 文件的移动</a>
<a href="http://www.devnp.com/2017/04/09/java-file-information-%e8%8e%b7%e5%8f%96%e6%96%87%e4%bb%b6%e6%88%96%e6%96%87%e4%bb%b6%e5%a4%b9%e4%bf%a1%e6%81%af/" target="_blank">11. Java File Information 获取文件或文件夹信息</a>
<a href="http://www.devnp.com/2017/04/09/java-file-update-information-%e6%9b%b4%e6%96%b0%e6%96%87%e4%bb%b6%e6%88%96%e8%80%85%e6%96%87%e4%bb%b6%e4%bf%a1%e6%81%af/" target="_blank">12. Java File Update Information 更新文件或者文件信息</a>
<a href="http://www.devnp.com/2017/04/10/java-file-check-%e6%96%87%e4%bb%b6%e6%a0%a1%e9%aa%8c%e7%a0%81%e7%9a%84%e7%94%9f%e6%88%90/">13. Java File Check 文件校验码的生成</a>
<a href="http://www.devnp.com/2017/04/11/java-file-disk-space-%e8%8e%b7%e5%8f%96%e7%a3%81%e7%9b%98%e7%a9%ba%e9%97%b4%e5%ae%b9%e9%87%8f%e4%bf%a1%e6%81%af/">14. Java File Disk Space 获取磁盘空间容量信息</a>

<h3>文件序列化</h3>
将实现<em>java.io.serialization </em>接口的对象写入到文件当中，同时对序列化后的文件进行读取，生产对象。

<a href="http://www.devnp.com/2017/04/10/java-file-write-an-object-%e5%b0%86%e5%af%b9%e8%b1%a1%e5%86%99%e5%85%a5%e5%88%b0%e6%96%87%e4%bb%b6/" target="_blank">1. Java File Write an Object 将对象写入到文件</a>
<a href="http://www.devnp.com/2017/04/11/java-file-read-an-object-%e4%bb%8e%e6%96%87%e4%bb%b6%e4%b8%ad%e8%af%bb%e5%8f%96%e5%af%b9%e8%b1%a1/" target="_blank">2. Java File Read an Object 从文件中读取对象</a>

<h3>文件的解压缩</h3>
使用<em>java.util.zip</em>及其他相关的文件操作类，来完成对文件的压缩和解压。

<a href="http://www.devnp.com/2017/04/11/java-file-compression-%e5%8e%8b%e7%bc%a9zip%e6%a0%bc%e5%bc%8f%e7%9a%84%e6%96%87%e4%bb%b6/" target="_blank">1. Java File Compression 压缩ZIP格式的文件</a>
<a href="http://www.devnp.com/2017/04/12/java-file-decompress-%e8%a7%a3%e5%8e%8bzip%e6%a0%bc%e5%bc%8f%e7%9a%84%e6%96%87%e4%bb%b6/" target="_blank">2. Java File Decompress 解压ZIP格式的文件</a>

<h2>目录(文件夹)相关</h2>
主要包括目录的创建，获取目录信息，目录的复制等。

<a href="http://www.devnp.com/2017/04/15/java-file-create-directory-%e5%88%9b%e5%bb%ba%e7%9b%ae%e5%bd%95%e6%96%87%e4%bb%b6%e5%a4%b9/" target="_blank">1. Java File Create Directory 创建目录(文件夹)</a>
<a href="http://www.devnp.com/2017/04/15/java-file-delete-directory-%e7%9b%ae%e5%bd%95%e6%96%87%e4%bb%b6%e5%a4%b9%e7%9a%84%e5%88%a0%e9%99%a4/" target="_blank">2. Java File Delete Directory 目录(文件夹)的删除</a>
<a href="http://www.devnp.com/2017/04/16/java-file-current-directory-%e8%8e%b7%e5%8f%96%e5%bd%93%e5%89%8d%e7%9b%ae%e5%bd%95%e6%96%87%e4%bb%b6%e5%a4%b9/" target="_blank">3. Java File Current Directory 获取当前目录(文件夹)</a>
<a href="http://www.devnp.com/2017/04/16/java-file-copy-directory-%e7%9b%ae%e5%bd%95%e6%96%87%e4%bb%b6%e5%a4%b9%e7%9a%84%e6%8b%b7%e8%b4%9d/" target="_blank">4.Java File Copy Directory 目录(文件夹)的拷贝</a>

<h3>临时文件</h3>
用来创建临时文件，写入信息到临时，系统退出时删除临时文件。

<a href="http://www.devnp.com/2017/04/15/java-file-temporary-%e5%88%9b%e5%bb%ba%e4%b8%b4%e6%97%b6%e6%96%87%e4%bb%b6/" target="_blank">1. Java File Temporary 创建临时文件</a>
<a href="http://www.devnp.com/2017/04/15/java-file-temporary-%e5%86%99%e5%85%a5%e4%bf%a1%e6%81%af%e5%88%b0%e4%b8%b4%e6%97%b6%e6%96%87%e4%bb%b6/" target="_blank">2. Java File Temporary 写入信息到临时文件</a>
<a href="http://www.devnp.com/2017/04/15/java-file-delete-temporary-%e5%88%a0%e9%99%a4%e4%b8%b4%e6%97%b6%e6%96%87%e4%bb%b6/" target="_blank">3. Java File Delete Temporary 删除临时文件</a>

<h2>系统属性</h2>
获取系统的属性信息。

<a href="http://www.devnp.com/2017/04/16/java-system-%e8%8e%b7%e5%8f%96%e7%b3%bb%e7%bb%9f%e5%b1%9e%e6%80%a7/" target="_blank">1. Java System 获取系统属性</a>