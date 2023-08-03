package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge1(request: Request, response: String) {
    println(
        """
            I've received the following request: 
            - Name: ${request.name}
            - Email: ${request.email}
            - Phone: ${request.phone}
            - Address: ${request.address}
            - Internet: ${request.internet}
            - VoIP: ${request.voip}
            - Mobile: ${request.mobile}
            - Landline: ${request.landline}
        """.trimIndent()
    )
}


fun challenge1_new2(request: Request, response: String) {
    println(
        """
            I've received the following request: 
            - Name: ${request.name}
            - Email: ${request.email}
            - Phone: ${request.phone}
            - Address: ${request.address}
            - Internet: ${request.internet}
            - VoIP: ${request.voip}
            - Mobile: ${request.mobile}
            - Landline: ${request.landline}
        """.trimIndent()
    )
}