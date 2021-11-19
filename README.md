# SoptSocar
### Naming Rule
#### Package
- 패키지의 이름은 항상 소문자로 하고, 밑줄을 사용하지 않습니다
- 두 개 이상의 단어를 한 번에 사용하는 것을 지양합니다

#### Class/Object
- Pascal Case
```
class BeMe
open class BeMeParent { /* ... */ }
object MoreSampleName : SampleName() { /* ... */ }
```

#### Function/Parameter/Variable
- Camel Case
```
val initList = mutableList<BeMeData>()
fun getList: List<BeMeData>() { /* ... */ }
```
#### Constant
- Upper Snake Case
- 상수는 companion objet에 넣어 보관합니다
```
companion object {
    const val MAX_COUNT = 8
}
```

### Formatting
#### Indenting
Tab 키를 써서 Indenting 합니다

#### 중괄호
괄호 뒤에 한 칸을 띄우고 사용합니다
```
if (elements != null) {
    for (element in elements) {
        // ...
    }
}
```

#### 괄호
- Control문(if/while/for)
    - 한 칸 띄어씁니다
- 생성자/Method
    - 붙여씁니다
```
if (isSpacing == true) { /*...*/ }
fun isSpacing() { /*...*/ }
```

#### Colon(:)
- 변수의 타입/함수 리턴 타입 결정
    - 콜론을 앞에 붙인다
- 상속받은 클래스/인터페이스 구분
    - 한 칸 띄어쓴다
```
fun isSpacing(): Boolean { /*...*/ }
class MainActivity : AppCompatActivity()
```


## Git Commit Message Convention

### Base Structure

```
#{issue_number} [TYPE] : subject

body(optional)

footer(optional)
```

### Issue Number
- GitHub에서 이슈를 트래킹을 할 수 있게 Issue Number를 커밋 메시지에 넣어줍니다

### TYPE
- FEAT: 새로운 기능 개발
- FIX: 버그 수정
- STYLE: 스타일(xml file) 코드 변경
- REFACTOR: 리팩토링
- CHORE: Gradle이나 설정 세팅할 때


## Branch Strategy
- 각자 이름으로 브랜치를 판 후 맡은 기능을 구현 후 풀리퀘스트를 통해 마스터에 머지하여 완성합니다.

## Folder Structure
``` kotlin
val folderStructure? = null
```
