package com.sgpublic.scit.tool.api.controller

import com.sgpublic.scit.tool.api.module.HitokotoModule
import com.sgpublic.scit.tool.api.result.SuccessResult
import okhttp3.FormBody
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HitokotoController {
    @Autowired
    private lateinit var hitokoto: HitokotoModule

    @RequestMapping("/scit/edutool/hitokoto")
    fun getHitokoto(): Map<String, Any>{
        val hitokoto = this.hitokoto.get()
        return SuccessResult(
            "hitokoto" to hitokoto.content,
            "from" to hitokoto.from
        )
    }
}