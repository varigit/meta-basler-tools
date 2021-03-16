LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5209c60dd8406ab83075514af62800b6"

SUMMARY = "Python 3 bindings for pylon"

PR = "r0"

inherit setuptools3

# Github source drive
SRC_URI = "git://github.com/basler/pypylon.git;protocol=https"
SRCREV = "0ca283e0ed2875c2fe3fff1d575acb03ca91d7c9"
S = "${WORKDIR}/git"

DEPENDS = "pylon python3 swig-native python3-setuptools-native"
RDEPENDS_${PN} = "python3-numpy"
INSANE_SKIP_${PN} += "already-stripped"

export PYLON_ROOT = "${WORKDIR}/recipe-sysroot/opt/pylon"
