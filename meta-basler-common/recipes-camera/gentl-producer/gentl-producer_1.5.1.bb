LICENSE = "Basler & BSD-3-Clause & ( BSD-3-Clause | GPLv2 ) & OpenSSL"
LIC_FILES_CHKSUM = " \
    file://COPYING.basler-daA3840-30mc-vvcam-imx8mp;md5=4d4bf860c9eb117189050b67643c481a \
    file://COPYING.basler-daA4200-30mci-imx8mp;md5=4d4bf860c9eb117189050b67643c481a \
    file://COPYING.basler-daA2500-60mci-imx8mp;md5=4d4bf860c9eb117189050b67643c481a \
"

FILES_${PN} += "/opt/*"

SUMMARY = "Basler MIPI GenTL producer"
PR = "r0"

INSANE_SKIP_${PN} = "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

RDEPENDS_${PN} = " libudev imx-gpu-g2d"

SRC_URI = " \
    file://basler-daA3840-30mc-vvcam-imx8mp.cti;subdir=${S} \
    file://basler-daA4200-30mci-imx8mp.cti;subdir=${S} \
    file://basler-daA2500-60mci-imx8mp.cti;subdir=${S} \
    file://COPYING.basler-daA3840-30mc-vvcam-imx8mp;subdir=${S} \
    file://COPYING.basler-daA4200-30mci-imx8mp;subdir=${S} \
    file://COPYING.basler-daA2500-60mci-imx8mp;subdir=${S} \
"

do_install() {
    install -d ${D}/opt/dart-bcon-mipi/lib/
    install -m755 ${S}/basler-daA3840-30mc-vvcam-imx8mp.cti ${D}/opt/dart-bcon-mipi/lib/
    install -m755 ${S}/basler-daA4200-30mci-imx8mp.cti ${D}/opt/dart-bcon-mipi/lib/
    install -m755 ${S}/basler-daA2500-60mci-imx8mp.cti ${D}/opt/dart-bcon-mipi/lib/
}


