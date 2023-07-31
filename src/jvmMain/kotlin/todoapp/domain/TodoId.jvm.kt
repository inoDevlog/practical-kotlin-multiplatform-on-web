package todoapp.domain

import java.util.*

actual interface TodoIdGenerator { // 실체화 된 코드가 따로 있다.
    actual fun generateId() = TodoId(UUID.randomUUID().toString().lowercase())

}
