Call SendMessage()
Sub SendMessage()
    Const EmailToSMSAddy = "snallajaru@dsthealth.com"
    Dim objOutlookRecip
    With CreateObject("Outlook.Application").CreateItem(0)
        Set objOutlookRecip = .Recipients.Add(EmailToSMSAddy)
        objOutlookRecip.Type = 1
        .Subject = "RxNova Smoke Test application needs your attention!"
        .Body = "Your Execution is Successful!"
        .Save
        .Send
    End With
End Sub