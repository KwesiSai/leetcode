var numUniqueEmails = function(emails) {
    let count = 0;
    let seenEmails = new Set();

    emails.forEach((email) => {
        let parts = email.split('@');
        if (parts.length === 2) {
            let local = parts[0];
            let domain = parts[1];

            local = local.split('+')[0];
            local = local.replace(/\./g, '');

            let normalizedEmail = local + '@' + domain;

            if (!seenEmails.has(normalizedEmail)) {
                count++;
                seenEmails.add(normalizedEmail);
            }
        }
    });

    return count;
};
