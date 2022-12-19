package aaa.financebets.alpha_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.Menu
import android.view.MenuItem
import androidx.core.text.HtmlCompat
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.alpha_v1.R


class Datenschutz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datenschutz)

        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) { actionBar.setDisplayHomeAsUpEnabled(true) }

        var htmlText = "<h1>Datenschutzerklärung</h1>\n" +
                "<h2>Einleitung</h2>\n" +
                "<p>Mit der folgenden Datenschutzerklärung möchten wir Sie darüber aufklären, welche Arten Ihrer personenbezogenen Daten (nachfolgend auch kurz als \"Daten“ bezeichnet) wir zu welchen Zwecken und in welchem Umfang im Rahmen der Bereitstellung unserer Applikation verarbeiten.</p>\n" +
                "<p>Die verwendeten Begriffe sind nicht geschlechtsspezifisch.</p>\n" +
                "<p>Stand: 9. September 2021</p><h2>Verantwortlicher</h2><p>Adrian Kühn<br>Unterm Kirchberg 10<br>99976 Rodeberg<br>E-Mail-Adresse: adriankuehn.ak@gmail.com</p>\n" +
                "<h2 id=\"mOverview\">Übersicht der Verarbeitungen</h2><p>Die nachfolgende Übersicht fasst die Arten der verarbeiteten Daten und die Zwecke ihrer Verarbeitung zusammen und verweist auf die betroffenen Personen.</p><h3>Arten der verarbeiteten Daten</h3>\n" +
                "<ul><li>Bestandsdaten (z.B. Namen, Adressen).</li><li>Inhaltsdaten (z.B. Eingaben in Onlineformularen).</li><li>Kontaktdaten (z.B. E-Mail, Telefonnummern).</li><li>Meta-/Kommunikationsdaten (z.B. Geräte-Informationen, IP-Adressen).</li></ul><h3>Kategorien betroffener Personen</h3><ul><li>Kommunikationspartner.</li><li>Nutzer (z.B. Webseitenbesucher, Nutzer von Onlinediensten).</li></ul><h3>Zwecke der Verarbeitung</h3><ul><li>Direktmarketing (z.B. per E-Mail oder postalisch).</li><li>Kontaktanfragen und Kommunikation.</li><li>Sicherheitsmaßnahmen.</li><li>Erbringung vertraglicher Leistungen und Kundenservice.</li><li>Verwaltung und Beantwortung von Anfragen.</li></ul><h2 id=\"m25\">Übermittlung von personenbezogenen Daten</h2><p>Im Rahmen unserer Verarbeitung von personenbezogenen Daten kommt es vor, dass die Daten an andere Stellen, Unternehmen, rechtlich selbstständige Organisationseinheiten oder Personen übermittelt oder sie ihnen gegenüber offengelegt werden. Zu den Empfängern dieser Daten können z.B. mit IT-Aufgaben beauftragte Dienstleister oder Anbieter von Diensten und Inhalten, die in eine Webseite eingebunden werden, gehören. In solchen Fall beachten wir die gesetzlichen Vorgaben und schließen insbesondere entsprechende Verträge bzw. Vereinbarungen, die dem Schutz Ihrer Daten dienen, mit den Empfängern Ihrer Daten ab.</p>\n" +
                "<h2 id=\"m12\">Löschung von Daten</h2><p>Die von uns verarbeiteten Daten werden nach Maßgabe der gesetzlichen Vorgaben gelöscht, sobald deren zur Verarbeitung erlaubten Einwilligungen widerrufen werden oder sonstige Erlaubnisse entfallen (z.B. wenn der Zweck der Verarbeitung dieser Daten entfallen ist oder sie für den Zweck nicht erforderlich sind).</p>\n" +
                "<p>Sofern die Daten nicht gelöscht werden, weil sie für andere und gesetzlich zulässige Zwecke erforderlich sind, wird deren Verarbeitung auf diese Zwecke beschränkt. D.h., die Daten werden gesperrt und nicht für andere Zwecke verarbeitet. Das gilt z.B. für Daten, die aus handels- oder steuerrechtlichen Gründen aufbewahrt werden müssen oder deren Speicherung zur Geltendmachung, Ausübung oder Verteidigung von Rechtsansprüchen oder zum Schutz der Rechte einer anderen natürlichen oder juristischen Person erforderlich ist.</p>\n" +
                "<p>Unsere Datenschutzhinweise können ferner weitere Angaben zu der Aufbewahrung und Löschung von Daten beinhalten, die für die jeweiligen Verarbeitungen vorrangig gelten.</p>\n" +
                "<h2 id=\"m367\">Registrierung, Anmeldung und Nutzerkonto</h2><p>Nutzer können ein Nutzerkonto anlegen. Im Rahmen der Registrierung werden den Nutzern die erforderlichen Pflichtangaben mitgeteilt und zu Zwecken der Bereitstellung des Nutzerkontos auf Grundlage vertraglicher Pflichterfüllung verarbeitet. Zu den verarbeiteten Daten gehören insbesondere die Login-Informationen (Nutzername, Passwort sowie eine E-Mail-Adresse).</p>\n" +
                "<p>Im Rahmen der Inanspruchnahme unserer Registrierungs- und Anmeldefunktionen sowie der Nutzung des Nutzerkontos speichern wir die IP-Adresse und den Zeitpunkt der jeweiligen Nutzerhandlung. Die Speicherung erfolgt auf Grundlage unserer berechtigten Interessen als auch jener der Nutzer an einem Schutz vor Missbrauch und sonstiger unbefugter Nutzung. Eine Weitergabe dieser Daten an Dritte erfolgt grundsätzlich nicht, es sei denn, sie ist zur Verfolgung unserer Ansprüche erforderlich oder es besteht eine gesetzliche Verpflichtung hierzu.</p>\n" +
                "<p>Die Nutzer können über Vorgänge, die für deren Nutzerkonto relevant sind, wie z.B. technische Änderungen, per E-Mail informiert werden.</p>\n" +
                "<p><strong>Löschung von Daten nach Kündigung</strong>: Wenn Nutzer ihr Nutzerkonto gekündigt haben, werden deren Daten im Hinblick auf das Nutzerkonto, vorbehaltlich einer gesetzlichen Erlaubnis, Pflicht oder Einwilligung der Nutzer, gelöscht.</p>\n" +
                "<p>Es obliegt den Nutzern, ihre Daten bei erfolgter Kündigung vor dem Vertragsende zu sichern. Wir sind berechtigt, sämtliche während der Vertragsdauer gespeicherte Daten des Nutzers unwiederbringlich zu löschen.</p>\n" +
                "<ul class=\"m-elements\"><li><strong>Verarbeitete Datenarten:</strong> Bestandsdaten (z.B. Namen, Adressen), Kontaktdaten (z.B. E-Mail, Telefonnummern), Inhaltsdaten (z.B. Eingaben in Onlineformularen), Meta-/Kommunikationsdaten (z.B. Geräte-Informationen, IP-Adressen).</li><li><strong>Betroffene Personen:</strong> Nutzer (z.B. Webseitenbesucher, Nutzer von Onlinediensten).</li><li><strong>Zwecke der Verarbeitung:</strong> Erbringung vertraglicher Leistungen und Kundenservice, Sicherheitsmaßnahmen, Verwaltung und Beantwortung von Anfragen.</li><li><strong>Rechtsgrundlagen:</strong> Vertragserfüllung und vorvertragliche Anfragen (Art. 6 Abs. 1 S. 1 lit. b. DSGVO), Berechtigte Interessen (Art. 6 Abs. 1 S. 1 lit. f. DSGVO).</li></ul>\n" +
                "\n" +
                "<h2 id=\"m367\">Besondere Hinweise zu Applikationen (Apps)</h2><p>Wir verarbeiten die Daten der Nutzer unserer Applikation, soweit diese erforderlich sind, um den Nutzern die Applikation sowie deren Funktionalitäten bereitstellen, deren Sicherheit überwachen und sie weiterentwickeln zu können. Wir können ferner Nutzer unter Beachtung der gesetzlichen Vorgaben kontaktieren, sofern die Kommunikation zu Zwecken der Administration oder Nutzung der Applikation erforderlich ist. Im Übrigen verweisen wir im Hinblick auf die Verarbeitung der Daten der Nutzer auf die Datenschutzhinweise in dieser Datenschutzerklärung. Rechtsgrundlagen: Die Verarbeitung von Daten, die für die Bereitstellung der Funktionalitäten der Applikation erforderlich ist, dient der Erfüllung von vertraglichen Pflichten. </p>\n" +
                "\n" +
                "<p><strong>Geräteberechtigungen für den Zugriff auf Funktionen und Daten:</strong><p>Die Nutzung unserer Applikation oder ihrer Funktionalitäten kann Berechtigungen der Nutzer für Zugriff auf bestimmten Funktionen der verwendeten Geräte oder auf die, auf den Geräten gespeicherten oder mit Hilfe der Geräte zugänglichen Daten voraussetzen. </p>\n" +
                "<ul class=\"m-elements\"><li><strong>Verarbeitete Datenarten:</strong> Bestandsdaten (z.B. Namen, Adressen), Kontaktdaten (z.B. E-Mail, Telefonnummern), Meta-/Kommunikationsdaten (z.B. Geräte-Informationen, IP-Adressen).</li><li><strong>Zwecke der Verarbeitung:</strong> Erbringung vertraglicher Leistungen und Kundenservice.</li><li><strong>Rechtsgrundlagen:</strong> Einwilligung (Art. 6 Abs. 1 S. 1 lit. a. DSGVO), Vertragserfüllung und vorvertragliche Anfragen (Art. 6 Abs. 1 S. 1 lit. b. DSGVO), Berechtigte Interessen (Art. 6 Abs. 1 S. 1 lit. f. DSGVO).</li></ul>\n" +
                "\n" +
                "<p>Erstellt mit kostenlosem Datenschutz-Generator.de von Dr. Thomas Schwenke</p>"
        val htmlToTextView : TextView = findViewById(R.id.tv_Datenschuterkl)
        htmlToTextView.setMovementMethod(ScrollingMovementMethod())
        htmlToTextView.text = HtmlCompat.fromHtml(htmlText, 0)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }
}