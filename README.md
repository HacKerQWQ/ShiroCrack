## 项目介绍
Shiro的rememberMe字段加解密工具

支持encode/decode/break三种模式对应加密，解密，爆破
```
java -jar ShiroCrack.jar [encode/decode/break] cipher [key]
```
**加密模式**
```
java -jar ShiroCrack.jar encode cipher key
```
**解密模式**
```
java -jar ShiroCrack.jar decode cipher key
```
**爆破模式**，在ShiroCrack.jar路径下自定义keys.txt即可
```
java -jar ShiroCrack.jar break cipher
```
## 鸣谢
密钥参考了以下两个项目
* [https://sec.dog/shiroDecrypt.html](https://link.segmentfault.com/?enc=csiU4A8AX4UoBpdNDVAADQ%3D%3D.SNJ8XgCeHqw42IW%2FflSY9dAsE2QLcV2EsHZrl88NGuO4j6mBj3zyM768ff4fUhe%2F)
* [ShiroAttack2](https://github.com/SummerSec/ShiroAttack2)