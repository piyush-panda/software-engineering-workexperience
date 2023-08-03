package io.github.u.ways

import io.github.u.ways.domain.Request
import javax.script.ScriptEngineManager

fun challenge2(request: Request) {

    val scriptEngineManager = ScriptEngineManager()
    val engineByName = scriptEngineManager.getEngineByName("graal.js")
    println(scriptEngineManager.engineFactories)
    engineByName.eval("print(`\n" +
            "            I've received the following request: \n" +
            "            - Name: ${request.name}\n" +
            "            - Email: ${request.email}\n" +
            "            - Phone: ${request.phone}\n" +
            "            - Address: ${request.address}\n" +
            "            - Internet: ${request.internet}\n" +
            "            - VoIP: ${request.voip}\n" +
            "            - Mobile: ${request.mobile}\n" +
            "            - Landline: ${request.landline}`)")
}


fun main() {
    challenge2(Request(
        "someName",
        "someEmail",
        "somephone",
        "someAddress",
        internet = true,
        voip = true,
        mobile = true,
        landline = false
    ))
}